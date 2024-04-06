
package com.mycompany.simulacionmemoria;

//Imports
public class Particion {
    //Variables
    private String nombre;
    private int tamanio;
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
    //Creación de particiones para JFrame TablaPartición
    public static Particion[] crearParticiones(int numeroParticiones, int tamanioTotal) {
        Particion[] particiones = new Particion[numeroParticiones];
        int tamanioParticion = tamanioTotal / numeroParticiones;
        for (int i = 0; i < numeroParticiones; i++) {
            particiones[i] = new Particion("Particion " + (i + 1), tamanioParticion);
        }
        return particiones;
    }
    //Encontrar cual n partición es la que tiene mayor memoria
    //Se utilizará para políticas de ubicación
    public static Particion encontrarMayor(Particion[] particiones) {
        Particion mayor = particiones[0];
        for (int i = 1; i < particiones.length; i++) {
            if (particiones[i].getTamanio() > mayor.getTamanio()) {
                mayor = particiones[i];
            }
        }
        return mayor;
    }
}
