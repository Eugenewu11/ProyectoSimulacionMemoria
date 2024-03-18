
package com.mycompany.simulacionmemoria;


public class DatosGlobales {
private static DatosGlobales instancia;

    private int cantidadTotalMemoria;
    private int numeroParticiones;
    private String politicaUbicacion;
    private int tiempoMinimo;
    private int tiempoMaximo;

    private DatosGlobales() {
        // Constructor privado para evitar la creación de nuevas instancias.
    }

    public static synchronized DatosGlobales obtenerInstancia() {
        if (instancia == null) {
            instancia = new DatosGlobales();
        }
        return instancia;
    }

    public void setCantidadTotalMemoria(int cantidadTotalMemoria) {
        this.cantidadTotalMemoria = cantidadTotalMemoria;
    }

    public int getCantidadTotalMemoria() {
        return cantidadTotalMemoria;
    }

    public void setNumeroParticiones(int numeroParticiones) {
        this.numeroParticiones = numeroParticiones;
    }

    public int getNumeroParticiones() {
        return numeroParticiones;
    }

    public void setPoliticaUbicacion(String politicaUbicacion) {
        this.politicaUbicacion = politicaUbicacion;
    }

    public String getPoliticaUbicacion() {
        return politicaUbicacion;
    }

    public void setTiempoMinimo(int tiempoMinimo) {
        this.tiempoMinimo = tiempoMinimo;
    }

    public int getTiempoMinimo() {
        return tiempoMinimo;
    }

    public void setTiempoMaximo(int tiempoMaximo) {
        this.tiempoMaximo = tiempoMaximo;
    }

    public int getTiempoMaximo() {
        return tiempoMaximo;
    }
}
