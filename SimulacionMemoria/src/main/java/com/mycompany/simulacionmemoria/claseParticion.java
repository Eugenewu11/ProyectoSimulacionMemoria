
package com.mycompany.simulacionmemoria;

//Imports

import java.util.ArrayList;

public class claseParticion {
    //Variables
    private String numeroParticion;
    private int tamanio;
    private static ArrayList<claseParticion> particiones = new ArrayList<>();
    private boolean asignada; // Indica si la partición está asignada a un proceso
    private claseProcesos procesoAsignado;
    //Constructor
    public claseParticion(String numeroParticion, int tamanio) {
        //Atributos
        this.numeroParticion = numeroParticion;
        this.tamanio = tamanio;
    }
    //Getter y setters
    
    //Numero de particion
    public String getNumeroParticion() {
        return numeroParticion;
    }
    //Tamano particion total
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int nuevoTamanio) {
        this.tamanio = nuevoTamanio;
    }
    //Cada vez que se asigne un particion se guarda aca
    public static void agregarParticion(claseParticion particion) {
        particiones.add(particion);
    }
    //Para obtener la lista de particiones creadas en TablaParticion
    public static ArrayList<claseParticion> obtenerParticiones() {
        return particiones;
    }
    
    public boolean esAsignada() {
        return asignada;
    }

    public void setAsignada(boolean asignada) {
        this.asignada = asignada;
    }

    public claseProcesos getProcesoAsignado() {
        return procesoAsignado;
    }

    public void setProcesoAsignado(claseProcesos procesoAsignado) {
        this.procesoAsignado = procesoAsignado;
    }
    
    public static claseParticion[] crearParticiones(int numeroParticiones, int tamanioTotal) {
    claseParticion[] particiones = new claseParticion[numeroParticiones];
    int tamanoParticion = tamanioTotal / numeroParticiones;
    int resto = tamanioTotal % numeroParticiones;

    for (int i = 0; i < numeroParticiones - 1; i++) {
        particiones[i] = new claseParticion("Partición " + (i + 1), tamanoParticion);
    }
    // Asignar el resto de la memoria a la última partición
    particiones[numeroParticiones - 1] = new claseParticion("Partición " + numeroParticiones, tamanoParticion + resto);
    return particiones;
}
    //Encontrar cual n partición es la que tiene mayor memoria
    public static claseParticion encontrarMayor(ArrayList<claseParticion> particiones) {
    claseParticion mayor = particiones.get(0); 
    for (claseParticion particion : particiones) {
      if (particion.getTamanio() > mayor.getTamanio()) {
        mayor = particion; 
      }
    }
    return mayor;
  } 
    public static int obtenerTamanioParticion(String numeroParticion) {
    // Iterar sobre la lista de particiones para encontrar la partición con el número dado
    for (claseParticion particion : particiones) {
        if (particion.getNumeroParticion().equals(numeroParticion)) {
            return particion.getTamanio(); // Devolver el tamaño de la partición encontrada
        }
    }
    return -1; // Devolver -1 si no se encuentra la partición
    }
}
