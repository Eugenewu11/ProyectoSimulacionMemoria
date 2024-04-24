
package com.mycompany.simulacionmemoria;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Timer;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class claseHilo extends Thread {
    private LinkedList<claseProcesos> listaProcesos;
    private ArrayList<claseParticion> listaParticiones;
    private String politicaUbicacion;
    private JTextField txtFieldParticion;
    private int duracion = 0;
    private DefaultTableModel modelo;
    private int segundosTranscurridos = 0; 
    Color Libre = new Color(0,204,0); //Verde
    Color EnUso = new Color(255, 204, 0);//Amarillo
    private Timer timer;
    public claseHilo(LinkedList<claseProcesos> listaProcesos, ArrayList<claseParticion> listaParticiones,JTextField txtFieldParticion,DefaultTableModel modelo,Timer timer) {
        this.listaProcesos = listaProcesos;
        this.listaParticiones = listaParticiones;
        this.politicaUbicacion = DatosGlobales.obtenerInstancia().getPoliticaUbicacion();
        this.txtFieldParticion = txtFieldParticion;
        this.modelo = modelo;
        this.timer = timer;
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

        //Actualizar la tabla que está en pantallaSimulacion
        while (true) {
            if (politicaUbicacion.equals("Primer Ajuste")) {
                politicasAjuste primerAjuste = new politicasAjuste();
                primerAjuste.primerAjuste(listaProcesos, listaParticiones);
            } else if (politicaUbicacion.equals("Mejor Ajuste")) {
                politicasAjuste mejorAjuste = new politicasAjuste();
                mejorAjuste.mejorAjuste(listaProcesos, listaParticiones);
            }

            // Actualizar la tabla y los JTextField
            for (claseProcesos proceso : listaProcesos) {
                if (proceso.getEstado().equals("En ejecución")) {
                    proceso.setDuracionProceso(proceso.getDuracionProceso() + 1);
                    int filaProceso = buscarProcesoEnTabla(proceso.getIdProceso());
                    //Mientras que hayan procesos registrados
                    if (filaProceso != -1) {
                        modelo.setValueAt(proceso.getDuracionProceso(), filaProceso, 5); // Actualizar duración en tabla
                        // Si se terminó de ejecutar el proceso
                        if (proceso.getDuracionProceso() == proceso.getTiempoRequerido()) {
                            proceso.setEstado("Finalizado");
                            liberarParticion(proceso); // Vaciar la partición una vez termine
                            // Cambiar el estado en la tabla de pantallaSimulacion a "Terminado"
                            modelo.setValueAt("Terminado", filaProceso, 3);
                            // Cambiar el color del JTextField a rojo
                            txtFieldParticion.setBackground(Color.RED);
                        }
                    }
                }
            }

            // Actualizar los JTextField
            for (claseParticion particion : listaParticiones) {
                if (particion.getProcesoAsignado() != null) {
                    int filaProceso = buscarProcesoEnTabla(particion.getProcesoAsignado().getIdProceso());
                    if (filaProceso != -1) {
                        String estadoProceso = particion.getProcesoAsignado().getEstado();
                        double porcentajeMemoria = (double) particion.getProcesoAsignado().getMemoriaRequerida() / particion.getTamanio() * 100;
                        modelo.setValueAt(estadoProceso, filaProceso, 3); // Actualizar tabla
                        if (estadoProceso.equals("En ejecución")) {
                            txtFieldParticion.setText("Proceso: " + particion.getProcesoAsignado().getNombreProceso() + "\nMemoria: " + String.format("%.2f", porcentajeMemoria) + "%");
                            txtFieldParticion.setBackground(EnUso); // Darle color de fondo amarillo
                        } else {
                            txtFieldParticion.setText(particion.getNumeroParticion() + "\nLibre");
                            txtFieldParticion.setBackground(Libre);
                        }
                    }
                } else {
                    txtFieldParticion.setText("Particion " + particion.getNumeroParticion() + "\nLibre");
                    txtFieldParticion.setBackground(Libre);
                }
            }

            // Verificar si hay más procesos "en espera" y no hay particiones libres
            boolean hayProcesosEnEspera = false;
            for (claseProcesos proceso : listaProcesos) {
                if (proceso.getEstado().equals("En espera")) {
                    hayProcesosEnEspera = true;
                    break;
                }
            }

            boolean todasLasParticionesOcupadas = true;
            for (claseParticion particion : listaParticiones) {
                if (particion.getProcesoAsignado() == null) {
                    todasLasParticionesOcupadas = false;
                    break;
                }
            }

            // Si hay más procesos "en espera" y no hay particiones libres, continuar el contador de timer
            if (hayProcesosEnEspera && todasLasParticionesOcupadas) {
                segundosTranscurridos++;
            }
            boolean procesoAlcanzado = false;
            for (claseProcesos proceso : listaProcesos) {
                if (proceso.getDuracionProceso() >= proceso.getTiempoRequerido()) {
                    procesoAlcanzado = true;
                    break;
                }
            }

        // Detener el timer si algún proceso ha alcanzado su tiempo requerido
        if (procesoAlcanzado) {
          timer.stop();
          break; // Salir del bucle while
        }
            try {
                Thread.sleep(1000); // 1 segundo de espera
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private int buscarProcesoEnTabla(int idProceso) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            int procesoId = (int) modelo.getValueAt(i, 0);
            if (procesoId == idProceso) {
                return i;
            }
        }
        return -1; // Retorna -1 si el proceso no se encuentra en la tabla
    }
    
    // Método para liberar la partición ocupada por un proceso
    private void liberarParticion(claseProcesos proceso) {
        for (claseParticion particion : listaParticiones) {
            if (particion.getProcesoAsignado() != null && particion.getProcesoAsignado().getIdProceso() == proceso.getIdProceso()) {
                particion.setProcesoAsignado(null);
                particion.setAsignada(false); // Marcar la partición como no asignada
                break;
            }
        }
    }
}
