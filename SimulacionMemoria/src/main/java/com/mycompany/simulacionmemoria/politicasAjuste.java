
package com.mycompany.simulacionmemoria;

//Imports

import java.util.ArrayList;
import java.util.LinkedList;


public class politicasAjuste {
    //Variables
    private ArrayList<claseParticion> particiones;
    private LinkedList<claseProcesos> procesos;
    //Procesos registrados en pantallaProcesos
    
    //Particiones (tamaño de cada particion)
  // Constructor
    public boolean primerAjuste(LinkedList<claseProcesos> procesos, ArrayList<claseParticion> particiones) {
    boolean asignado = false; // Variable para indicar si al menos un proceso fue asignado correctamente

    for (claseProcesos proceso : procesos) {
        int memoriaRequerida = proceso.getMemoriaRequerida();
        // Recorremos las particiones para encontrar la primera adecuada para el proceso actual
        for (claseParticion particion : particiones) {
            if (!particion.esAsignada() && particion.getTamanio() >= memoriaRequerida) {
                // Si encontramos una partición adecuada, asignamos el proceso a esa partición
                particion.setProcesoAsignado(proceso);
                particion.setAsignada(true);
                // Actualizamos la memoria restante de la partición si es necesario
                if (particion.getTamanio() > memoriaRequerida) {
                    int memoriaRestante = particion.getTamanio() - memoriaRequerida;
                    particion.setTamanio(memoriaRestante);
                }
                // Marcamos el proceso como asignado
                proceso.setEstado("Asignado a partición " + particion.getNumeroParticion());
                double porcentajeMemoria = (double) proceso.getMemoriaRequerida() / particion.getTamanio() * 100;
                asignado = true; // Indicamos que al menos un proceso fue asignado correctamente
                break; // Proceso asignado, salimos del bucle
            }
        }
    }
    return asignado;
    }
    public boolean mejorAjuste(LinkedList<claseProcesos> procesos, ArrayList<claseParticion> particiones) {
    boolean asignado = false; // Variable para indicar si al menos un proceso fue asignado correctamente

    for (claseProcesos proceso : procesos) {
        int memoriaRequerida = proceso.getMemoriaRequerida();
        claseParticion mejorParticion = null;
        // Recorremos las particiones para encontrar la mejor adecuada para el proceso actual
        for (claseParticion particion : particiones) {
            if (!particion.esAsignada() && particion.getTamanio() >= memoriaRequerida) {
                // Si encontramos una partición adecuada, verificamos si es mejor que la partición anterior
                if (mejorParticion == null || particion.getTamanio() < mejorParticion.getTamanio()) {
                    mejorParticion = particion;
                }
            }
        }
        // Si encontramos una partición adecuada, asignamos el proceso a esa partición
        if (mejorParticion != null) {
            mejorParticion.setProcesoAsignado(proceso);
            mejorParticion.setAsignada(true);
            // Actualizamos la memoria restante de la partición si es necesario
            if (mejorParticion.getTamanio() > memoriaRequerida) {
                int memoriaRestante = mejorParticion.getTamanio() - memoriaRequerida;
                mejorParticion.setTamanio(memoriaRestante);
            }
            // Marcamos el proceso como asignado
            proceso.setEstado("Asignado a partición " + mejorParticion.getNumeroParticion());
            double porcentajeMemoria = (double) proceso.getMemoriaRequerida() / mejorParticion.getTamanio() * 100;
            asignado = true; // Indicamos que al menos un proceso fue asignado correctamente
        }
    }
    return asignado;
}
    public LinkedList<claseProcesos> getProcesos() {
        return procesos;
    }

    // Método para obtener la lista de particiones
    public ArrayList<claseParticion> getParticiones() {
        return particiones;
    }
}
