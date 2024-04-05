
package com.mycompany.simulacionmemoria;

//Aqui van los imports

import javax.swing.Timer;



public class Procesos {
    private String nombreProceso;
    private int idProceso;
    private int Estado;
    private int memoriaRequerida;
    private int tiempoRequerido;
    private int duracionProceso;
    private int actTiempo;
    private Timer timer;
     // Constructor
    public Procesos(String nombreProceso, int idProceso, String estadoProceso, int memoriaRequerida, 
            int tiempoRequerido, int duracionProceso){
        //atributos
        this.nombreProceso = nombreProceso;
        this.idProceso = idProceso;
        this.memoriaRequerida = memoriaRequerida;
        this.tiempoRequerido = tiempoRequerido;
        this.duracionProceso = duracionProceso;
    }
    // Getters y setters
    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public void setMemoriaRequerida(int memoriaRequerida) {
        this.memoriaRequerida = memoriaRequerida;
    }

    public int getTiempoRequerido() {
        return tiempoRequerido;
    }

    public void setTiempoRequerido(int tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }

    public int getDuracionProceso() {
        return duracionProceso;
    }

    public void setDuracionProceso(int duracionProceso) {
        this.duracionProceso = duracionProceso;
    }
}
