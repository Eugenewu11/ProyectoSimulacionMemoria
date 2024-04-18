
package com.mycompany.simulacionmemoria;

//Imports
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;

public class pantallaProcesos extends javax.swing.JFrame {
  DefaultTableModel modelo;
  public LinkedList<claseProcesos> procesos;
  public ArrayList<claseParticion> particiones = claseParticion.obtenerParticiones();
  private Timer timer;//Timer para columna de duracion de un proceso
  private LinkedList<claseProcesos> listaProcesos = new LinkedList<>();
 
    public pantallaProcesos() {
        initComponents();
        listaProcesos = new LinkedList<>();
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFprocesoNuevo = new javax.swing.JTextField();
        txtFmemoriaRequerida = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Tabla de Procesos ");

        tablaProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProcesos);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Proceso a registrar:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Memoria requerida:");

        txtFprocesoNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFprocesoNuevo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFprocesoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFprocesoNuevoActionPerformed(evt);
            }
        });

        txtFmemoriaRequerida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFmemoriaRequerida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFmemoriaRequerida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFmemoriaRequeridaActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFmemoriaRequerida, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtFprocesoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addComponent(btnRegistrar)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFprocesoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFmemoriaRequerida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.procesos = new LinkedList();       
        //inicializar modelo de datos
       modelo = new DefaultTableModel()
          {
           //Evitar poder editar las celdas del JTable
           public boolean isCellEditable(int rowIndex, int mColIndex){
                return false;
           }
      };
       modelo.addColumn("ID Proceso");//0
       modelo.addColumn("Nombre Proceso");//1
       modelo.addColumn("Memoria Requerida");//2
       modelo.addColumn("Estado");//3
       modelo.addColumn("Tiempo requerido");//4
       modelo.addColumn("Duración");//5
       //Estblacer el modelo
       tablaProcesos.setModel(modelo);
       //Personalización de anchos por columna
       tablaProcesos.getColumnModel().getColumn(0).setMaxWidth(300);
       tablaProcesos.getColumnModel().getColumn(0).setPreferredWidth(300);
       tablaProcesos.getColumnModel().getColumn(1).setMaxWidth(300);
       tablaProcesos.getColumnModel().getColumn(1).setPreferredWidth(300);  
       tablaProcesos.getColumnModel().getColumn(2).setMaxWidth(300);
       tablaProcesos.getColumnModel().getColumn(2).setPreferredWidth(300);  
       tablaProcesos.getColumnModel().getColumn(3).setMaxWidth(300);
       tablaProcesos.getColumnModel().getColumn(3).setPreferredWidth(300);  
       tablaProcesos.getColumnModel().getColumn(4).setMaxWidth(300);
       tablaProcesos.getColumnModel().getColumn(4).setPreferredWidth(300);  
       tablaProcesos.getColumnModel().getColumn(5).setMaxWidth(300);
       tablaProcesos.getColumnModel().getColumn(5).setPreferredWidth(300);  
    }//GEN-LAST:event_formWindowOpened
    
    private void txtFprocesoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFprocesoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFprocesoNuevoActionPerformed

    private void txtFmemoriaRequeridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFmemoriaRequeridaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFmemoriaRequeridaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //Obtenemos la info de los textField
        String nombreProceso = txtFprocesoNuevo.getText();
        int memoriaRequerida = Integer.parseInt(txtFmemoriaRequerida.getText());
        //Encontramos cual partición tiene mayor memoria recorriendo el arreglo de particiones hecha en JFrame TablaPartición
        claseParticion mayorParticion = claseParticion.encontrarMayor(particiones);
        //Validar que el proceso que se obtiene no sea mayor que el tamaño de partición más grande
        if (memoriaRequerida <= mayorParticion.getTamanio()) {
            //Estblece tiempo random requerido para que una aplicación este en memoria
            int tiempoRequerido = (int) (Math.random() * (DatosGlobales.obtenerInstancia().getTiempoMaximo() - DatosGlobales.obtenerInstancia().getTiempoMinimo()) + DatosGlobales.obtenerInstancia().getTiempoMinimo());
            // Generar un id para el proceso
            int idProceso = procesos.size() + 1;
            //Establecemos el estado
            String estado = (memoriaRequerida > mayorParticion.getTamanio()) ? "En espera" : "En ejecución";
            //Creamos un objeto para cada proceso
            claseProcesos procesoPantallaProcesos = new claseProcesos(nombreProceso, idProceso, estado, memoriaRequerida, tiempoRequerido, 0);
            procesos.add(procesoPantallaProcesos);
            listaProcesos.add(procesoPantallaProcesos); 

            Object[] fila = {procesoPantallaProcesos.getIdProceso(), procesoPantallaProcesos.getNombreProceso(), procesoPantallaProcesos.getMemoriaRequerida(), procesoPantallaProcesos.getEstado(), procesoPantallaProcesos.getTiempoRequerido(), 
                procesoPantallaProcesos.getDuracionProceso()};
            modelo.addRow(fila);       
            //Empieza el timer
            empezarTimer(procesoPantallaProcesos);
            //Vaciar los textField despues de haberle dado click en el btn 
            txtFprocesoNuevo.setText("");
            txtFmemoriaRequerida.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "La memoria requerida es mayor que la partición más grande.", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    //Otras funciones
    private void empezarTimer(claseProcesos proceso) {
        // Crear un nuevo timer para el proceso y ejecutar el ProcesoTimer
        Timer timer = new Timer();
        timer.schedule(new claseTimer(proceso, this), 0, 1000); // El timer se ejecutará cada segundo
    }
    public void actualizarDuracionEnTabla(claseProcesos proceso) {
    //Actualiza el tiempo en la tabla    
    // Buscar la fila correspondiente al proceso en la tabla
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (Integer.parseInt(modelo.getValueAt(i, 0).toString()) == proceso.getIdProceso()) {
                // Actualizar el valor de la duración en la fila correspondiente
                modelo.setValueAt(proceso.getDuracionProceso(), i, 5);
                break;
            }
        }
    }
    // Método para obtener la lista de procesos registrados
    public LinkedList<claseProcesos> getProcesosRegistrados() {
        return procesos;
        //Obtiene la lista de procesos registrados en la tabla 
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaProcesos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProcesos;
    public javax.swing.JTextField txtFmemoriaRequerida;
    public javax.swing.JTextField txtFprocesoNuevo;
    // End of variables declaration//GEN-END:variables
}
