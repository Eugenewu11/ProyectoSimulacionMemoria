
package com.mycompany.simulacionmemoria;

//Imports

import java.util.ArrayList;

public class Particion {
    //Variables
    private String nombre;
    private int tamanio;
    private static ArrayList<Particion> particiones = new ArrayList<>();
    //Constructor
    public Particion(String nombre, int tamanio) {
        //Atributos
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    //Getter y setters
    public String getNombre() {
        return nombre;
    }

    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int nuevoTamanio) {
        this.tamanio = nuevoTamanio;
    }
    public static void agregarParticion(Particion particion) {
        particiones.add(particion);
    }

    public static ArrayList<Particion> obtenerParticiones() {
        return particiones;
    }
    public static Particion[] crearParticiones(int numeroParticiones, int tamanioTotal) {
    Particion[] particiones = new Particion[numeroParticiones];
    int tamanoParticion = tamanioTotal / numeroParticiones;
    int resto = tamanioTotal % numeroParticiones;

    for (int i = 0; i < numeroParticiones - 1; i++) {
        particiones[i] = new Particion("Partición " + (i + 1), tamanoParticion);
    }

    // Asignar el resto de la memoria a la última partición
    particiones[numeroParticiones - 1] = new Particion("Partición " + numeroParticiones, tamanoParticion + resto);

    return particiones;
}
    //Encontrar cual n partición es la que tiene mayor memoria
    public static Particion encontrarMayor(ArrayList<Particion> particiones) {
    Particion mayor = particiones.get(0); // Initialize with first partition
    for (Particion particion : particiones) {
      if (particion.getTamanio() > mayor.getTamanio()) {
        mayor = particion; // Update 'mayor' if current partition is larger
      }
    }
    return mayor; // Return the largest partition found
  }
}
