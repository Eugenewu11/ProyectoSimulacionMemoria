
package com.mycompany.simulacionmemoria;

import java.util.LinkedList;
import java.util.TimerTask;
import java.util.Timer;


public class claseTimer extends TimerTask{
    private claseProcesos proceso;
    private pantallaProcesos pantalla;

    public claseTimer(claseProcesos proceso,pantallaProcesos pantalla) {
        this.proceso = proceso;
        this.pantalla = pantalla;
    }
    @Override
    public void run() {
        proceso.setDuracionProceso(proceso.getDuracionProceso() + 1);
        pantalla.actualizarDuracionEnTabla(proceso);//Actualiza graficamente que se vaya actualizando en la tabla el tiempo de duracion

        // Verificar si se ha alcanzado la duración requerida y detener el timer si es necesario
        // if (duracionActual >= proceso.getTiempoRequerido()) {
        //     cancel(); // Detiene el timer
        // }
    }
}
