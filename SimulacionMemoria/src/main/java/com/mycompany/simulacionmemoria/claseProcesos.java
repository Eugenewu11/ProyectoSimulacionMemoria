
package com.mycompany.simulacionmemoria;
//Clase para manejar datos que vendrán de pantallaProceso

//Imports
import java.util.LinkedList;
public class claseProcesos {
    //Varibales
    private String nombreProceso;
    private int idProceso;
    private String estadoProceso;
    private int memoriaRequerida;
    private int tiempoRequerido;
    private int duracionProceso;
    private LinkedList<claseProcesos> listaProcesos = new LinkedList<>();
    // Constructor
    public claseProcesos(String nombreProceso, int idProceso,String estadoProceso, int memoriaRequerida, 
                    int tiempoRequerido, int duracionProceso){
        //atributos
        this.nombreProceso = nombreProceso;
        this.idProceso = idProceso;
        this.estadoProceso = estadoProceso;
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
    public String getEstado(){
        return estadoProceso;
    }
    public void setEstado(String estadoProceso){
        this.estadoProceso = estadoProceso;
    }
    public LinkedList<claseProcesos> getListaProcesos() {
    return listaProcesos;
  }
  public void setListaProcesos(LinkedList<claseProcesos> listaProcesos) {
    this.listaProcesos = listaProcesos;
  }
  public double calcularPorcentajeMemoriaOcupada(int tamanioParticion) {
        // Calcular el porcentaje de memoria ocupada por este proceso en relación con el tamaño de la partición
        double porcentaje = ((double) this.memoriaRequerida / tamanioParticion) * 100;
        return porcentaje;
    }
}
