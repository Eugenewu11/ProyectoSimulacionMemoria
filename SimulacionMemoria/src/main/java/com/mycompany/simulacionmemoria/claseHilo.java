
package com.mycompany.simulacionmemoria;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class claseHilo extends Thread {
    private LinkedList<claseProcesos> listaProcesos;
    private ArrayList<claseParticion> listaParticiones;
    private String politicaUbicacion;
    private JTextField txtFieldParticion;
    private int duracion = 0;
    private DefaultTableModel modelo;
    private JTable tablaProcesos;
    Color Libre = new Color(0,204,0); //Verde
    Color EnUso = new Color(255, 204, 0);//Amarillo
    public claseHilo(LinkedList<claseProcesos> listaProcesos, ArrayList<claseParticion> listaParticiones,JTextField txtFieldParticion,DefaultTableModel modelo,JTable tablaProcesos) {
        this.listaProcesos = listaProcesos;
        this.listaParticiones = listaParticiones;
        this.politicaUbicacion = DatosGlobales.obtenerInstancia().getPoliticaUbicacion();
        this.txtFieldParticion = txtFieldParticion;
        this.modelo = modelo;
        this.tablaProcesos = tablaProcesos;
    }
    @Override
    public void run() {
    if (politicaUbicacion.equals("Primer Ajuste")) {
      politicasAjuste primerAjuste = new politicasAjuste();
      primerAjuste.primerAjuste(listaProcesos, listaParticiones);
    } else if (politicaUbicacion.equals("Mejor Ajuste")) {
      politicasAjuste mejorAjuste = new politicasAjuste();
      mejorAjuste.mejorAjuste(listaProcesos, listaParticiones);
    }

    //Actualizar la tabla
    while (true) {
      for (claseProcesos proceso : listaProcesos) {
        if (proceso.getEstado().equals("En ejecución")) {
          proceso.setDuracionProceso(proceso.getDuracionProceso() + 1);
          int filaProceso = buscarProcesoEnTabla(proceso.getIdProceso());
          if (filaProceso != -1) {
            modelo.setValueAt(proceso.getDuracionProceso(), filaProceso, 5); //Actualizar duracion en tabla
          }

          //Si se termino de ejecutar el proceso
          if (proceso.getDuracionProceso() == proceso.getTiempoRequerido()) {
            proceso.setEstado("Finalizado");
            liberarParticion(proceso); //Vacia la particion una vez termine
            actualizarEstadoProcesosEnEspera();
          }
        }
      }

      for (claseParticion particion : listaParticiones) {
        if (particion.getProcesoAsignado() != null) {
          int filaProceso = buscarProcesoEnTabla(particion.getProcesoAsignado().getIdProceso());
          if (filaProceso != -1) {
            String estadoProceso = particion.getProcesoAsignado().getEstado();
            double porcentajeMemoria = (double) particion.getProcesoAsignado().getMemoriaRequerida() / particion.getTamanio() * 100;
            modelo.setValueAt(estadoProceso, filaProceso, 3); //Actualizar tabla
            if (estadoProceso.equals("En ejecución")) {
              txtFieldParticion.setText("Proceso: " + particion.getProcesoAsignado().getNombreProceso() + "\nMemoria: " + String.format("%.2f", porcentajeMemoria) + "%");
              txtFieldParticion.setBackground(EnUso); //Darle color de fondo
            } else {
              txtFieldParticion.setText("Particion " + particion.getNumeroParticion() + "\nLibre");
              txtFieldParticion.setBackground(Libre);
            }
          }
        } else {
          txtFieldParticion.setText("Particion " + particion.getNumeroParticion() + "\nLibre");
          txtFieldParticion.setBackground(Libre); 
        }
      }

      try {
        Thread.sleep(1000); //1seg de espera
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
     }
    }
    private int buscarProcesoEnTabla(int idProceso) {
    for (int i = 0; i < modelo.getRowCount(); i++) {
        int procesoId = (int) modelo.getValueAt(i, 0); // Obtiene el valor directamente sin castear a String
        if (procesoId == idProceso) {
            return i;
        }
    }
    return -1; // Retorna procesos
}

    private void liberarParticion(claseProcesos proceso) {
      for (claseParticion particion : listaParticiones) {
        if (particion.getProcesoAsignado() != null && particion.getProcesoAsignado().getIdProceso() == proceso.getIdProceso()) {
          particion.setProcesoAsignado(null);
          break;
        }
      }
    }

  private void actualizarEstadoProcesosEnEspera() {
    for (claseProcesos proceso : listaProcesos) {
      if (proceso.getEstado().equals("En espera")) {
        boolean asignado = false;
        for (claseParticion particion : listaParticiones) {
          if (particion.getProcesoAsignado() == null && particion.getTamanio() >= proceso.getMemoriaRequerida()) {
            proceso.setEstado("En ejecución");
            particion.setProcesoAsignado(proceso);
            asignado = true;
            break;
          }
        }
        if (!asignado) {
          proceso.setEstado("Bloqueado");
        }
      }
    }
  }
}
