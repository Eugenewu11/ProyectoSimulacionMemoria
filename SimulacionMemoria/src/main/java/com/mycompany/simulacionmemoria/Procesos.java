
package com.mycompany.simulacionmemoria;
//Clase para manejar datos que vendrán de pantallaProceso

//Imports
import javax.swing.Timer;
public class Procesos {
    //Varibales
    private String nombreProceso;
    private int idProceso;
    private String estadoProceso;
    private int memoriaRequerida;
    private int tiempoRequerido;
    private int actTiempo;
    private int duracionProceso;
    private Timer timer;
    // Constructor
    public Procesos(String nombreProceso, int idProceso,String estadoProceso, int memoriaRequerida, 
                    int tiempoRequerido, int duracionProceso){
        //atributos
        this.nombreProceso = nombreProceso;
        this.idProceso = idProceso;
        this.estadoProceso = estadoProceso;
        this.memoriaRequerida = memoriaRequerida;
        this.tiempoRequerido = tiempoRequerido;
        this.duracionProceso = duracionProceso;
        timer = new Timer(1000, (e) -> {
            actTiempo++;
        });
        timer.start();
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
    public void ActTiempo(){
        //actualizador de tiempo para columna "Duración"
        this.actTiempo++;
    }
    public String getEstado(){
        return estadoProceso;
    }
    public void setEstado(String estadoProceso){
        this.estadoProceso = estadoProceso;
    }
    public Timer getTimer() {
        return timer;
    }
}
