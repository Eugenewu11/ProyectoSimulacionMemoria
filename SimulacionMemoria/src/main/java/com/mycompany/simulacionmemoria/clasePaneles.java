
package com.mycompany.simulacionmemoria;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class clasePaneles extends JPanel{
    private static final int maxFilas = 5;
    private static final int maxColumnas = 4;
    private static final Color Libre = new Color(0, 204, 0); 
    private static final Color enUso = new Color(255, 204, 0);

    private ArrayList<claseParticion> particiones;
    private LinkedList<claseProcesos> procesos;
    private boolean estado;
    private int totalMemoria = DatosGlobales.obtenerInstancia().getCantidadTotalMemoria();
    
    public clasePaneles(ArrayList<claseParticion> particiones, LinkedList<claseProcesos> procesos) {
        this.particiones = particiones;
        this.procesos = procesos;
    }   
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Calculo del tamano de los paneles
        int panelWidth = getWidth() / maxColumnas;
        int panelHeight = getHeight() / maxFilas;

        // Inicializar variables
        int filaActual = 0;
        int ColumnaActual = 0;

        for (claseParticion particion : particiones) {
            JPanel panel = new JPanel();
            panel.setBackground(Libre); //background inicial en verde o sea en libre

            panel.setBounds(ColumnaActual * panelWidth, filaActual * panelHeight, panelWidth, panelHeight);
            actualizarPanel(panel, particion);

            //Añadir panel a jpanel
            add(panel);

            // Incrementar fila o columna para el siguiente panel
            if (++ColumnaActual >= maxColumnas) {
                ColumnaActual = 0;
                filaActual++;
            }
        }
    }
    private void actualizarPanel(JPanel panel, claseParticion particion) {
        //Ver si el proceso se asigno a particion
        claseProcesos procesoAsignado = particion.getProcesoAsignado();

        //Cambiar color de panel
        if (procesoAsignado != null) {
            panel.setBackground(enUso);
        } else {
            panel.setBackground(Libre);
        }

        //Crear y agregar los JLabel 
        JLabel numeroParticionLabel = new JLabel("Particion: " + particion.getNumeroParticion());
        JLabel nombreProcesoLabel = new JLabel("Proceso: " + (procesoAsignado != null ? procesoAsignado.getNombreProceso() : ""));
        JLabel porcentajeUsoLabel = new JLabel("Uso: " + (procesoAsignado != null ? procesoAsignado.calcularPorcentajeMemoriaOcupada(particion.getTamanio()) + "%" : "0%"));
        //Alinear los label
        numeroParticionLabel.setHorizontalAlignment(JLabel.CENTER);
        nombreProcesoLabel.setHorizontalAlignment(JLabel.CENTER);
        porcentajeUsoLabel.setHorizontalAlignment(JLabel.CENTER);

        panel.add(numeroParticionLabel);
        panel.add(nombreProcesoLabel);
        panel.add(porcentajeUsoLabel);

        // Arreglar los labels verticalmente
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }
}
