
package com.mycompany.simulacionmemoria;

import java.util.ArrayList;
import java.util.LinkedList;


public class claseHilo extends Thread {
    private LinkedList<claseProcesos> listaProcesos;
    private ArrayList<claseParticion> listaParticiones;
    private String politicaUbicacion;
    public claseHilo(LinkedList<claseProcesos> listaProcesos, ArrayList<claseParticion> listaParticiones) {
        this.listaProcesos = listaProcesos;
        this.listaParticiones = listaParticiones;
        this.politicaUbicacion = DatosGlobales.obtenerInstancia().getPoliticaUbicacion();


    }
    @Override
    public void run() {
    if (politicaUbicacion.equals("Primer Ajuste")) {
        // Crear una instancia de primerAjuste
        primerAjuste miPrimerAjuste = new primerAjuste();        
        miPrimerAjuste.asignarProceso(listaProcesos, listaParticiones);
       }
    }
}
