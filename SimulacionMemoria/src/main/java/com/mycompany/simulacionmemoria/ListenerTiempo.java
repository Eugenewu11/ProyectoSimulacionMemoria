
package com.mycompany.simulacionmemoria;

//Imports
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ListenerTiempo implements ActionListener {
    //Variables
    private Procesos proceso;
    private DefaultTableModel modelo;
    //Constructor
    public ListenerTiempo(Procesos proceso, DefaultTableModel modelo){
        //Atributos
        this.proceso = proceso;
        this.modelo=modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        proceso.ActTiempo();
        modelo.setValueAt(e, 0, 0);//VALRO QUE VOY A ANADIR, FILA,COLUMNA
    }
}
