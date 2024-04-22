
package com.mycompany.simulacionmemoria;

import java.util.LinkedList;
import java.util.TimerTask;
import java.util.Timer;


public class claseTimer extends TimerTask{
    private claseProcesos proceso;
    

    public claseTimer(claseProcesos proceso) {
        this.proceso = proceso;
    }
    @Override
    public void run() {
        proceso.setDuracionProceso(proceso.getDuracionProceso() + 1);

        // Verificar si se ha alcanzado la duración requerida y detener el timer si es necesario
        // if (duracionActual >= proceso.getTiempoRequerido()) {
        //     cancel(); // Detiene el timer
        // }
    }
}
