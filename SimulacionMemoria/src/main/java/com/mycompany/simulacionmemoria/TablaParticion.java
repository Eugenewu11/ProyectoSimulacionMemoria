
package com.mycompany.simulacionmemoria;

/**
 *
 * @author HD
 */
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JOptionPane;

public class TablaParticion extends javax.swing.JFrame {
   
   DefaultTableModel modelo1;
   DatosGlobales datosTablaP = DatosGlobales.obtenerInstancia();
   int cantidadTotalMemoria = datosTablaP.getCantidadTotalMemoria();
   int numeroParticiones = datosTablaP.getNumeroParticiones();
   String politicaUbicacion = datosTablaP.getPoliticaUbicacion();
   private int contadorParticiones = 0;
   
    public TablaParticion(){
    initComponents();
    totalMemTP.setText(String.valueOf(cantidadTotalMemoria));
    NumPartTP.setText(String.valueOf(numeroParticiones));
    polUbiTP.setText(politicaUbicacion);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalMemTP = new javax.swing.JTextField();
        NumPartTP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        polUbiTP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAsignartp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        memRestante = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla1.setRowHeight(30);
        tabla1.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tabla1.setShowHorizontalLines(true);
        tabla1.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tabla1);

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(102, 204, 255));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tabla);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Particiones de memoria");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Total memoria asignada:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Número total de particiones:");

        totalMemTP.setEditable(false);
        totalMemTP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalMemTP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        NumPartTP.setEditable(false);
        NumPartTP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumPartTP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        NumPartTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumPartTPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese la cantidad de memoria a asignar a cada partición:");
        jLabel4.setToolTipText("Recuerde que no puede usar más de la memoria total asignada previamente");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Política de ubicación:");

        polUbiTP.setEditable(false);
        polUbiTP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        polUbiTP.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("GB");

        btnAsignartp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAsignartp.setText("Asignar");
        btnAsignartp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignartpActionPerformed(evt);
            }
        });

        jLabel8.setText("Memoria que sobró:");

        memRestante.setEditable(false);
        memRestante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        memRestante.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel9.setText("ADVERTENCIA: No debe sobrar memoria por asignar!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(46, 46, 46)
                                        .addComponent(totalMemTP, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NumPartTP, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                            .addComponent(polUbiTP))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAsignartp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(memRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(119, 119, 119)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalMemTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NumPartTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(polUbiTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignartp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(memRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumPartTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumPartTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumPartTPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //inicializar modelo de dato
       modelo1 = new DefaultTableModel()
          {
           //Evitar poder editar las celdas del JTable
           public boolean isCellEditable(int rowIndex, int mColIndex){
                return false;
           }
      };
        modelo1.addColumn("Partición");
        modelo1.addColumn("Memoria Asignada");

       //colocar el modelo en el JTable
       tabla.setModel(modelo1);
       
       //Ancho de columnas
       tabla.getColumnModel().getColumn(0).setMaxWidth(300);
       tabla.getColumnModel().getColumn(0).setPreferredWidth(300);
       tabla.getColumnModel().getColumn(1).setMaxWidth(300);
       tabla.getColumnModel().getColumn(1).setPreferredWidth(300);      
    }//GEN-LAST:event_formWindowOpened

    private void btnAsignartpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignartpActionPerformed
        
        
        detalleTp x = new detalleTp(this,true);
        x.setVisible(true);
        
        if (x.getRootPane() != null)
            try{
                 int nParticiones = Integer.parseInt(NumPartTP.getText());
                 if (nParticiones <= 0) { //Validar si en verdad hay particiones
                    JOptionPane.showMessageDialog(this, "El número de particiones debe ser mayor que cero.");
                    return;
                 } 
                 int totalFilas = modelo1.getRowCount();
                 if (totalFilas >= nParticiones) //Una vez se haya asignada memoria a todas las particiones se deshabilita la opcion de agregar
                 {
                    JOptionPane.showMessageDialog(this, "Se ha alcanzado el límite de particiones.");
                    btnAsignartp.setVisible(false); 
                    return;
                 }
                 
                 if (contadorParticiones > nParticiones) {
                    JOptionPane.showMessageDialog(this, "No se pueden agregar más particiones.");
                    return;
                }
                 int memoriaAsignada = 1; // Valor predeterminado si no se ingresa nada
            try {
                memoriaAsignada = Integer.parseInt(x.detalleMemoria.getText());
                if (memoriaAsignada <= 0) {
                    JOptionPane.showMessageDialog(this, "La cantidad de memoria asignada debe ser mayor que cero.");
                    contadorParticiones--;//contador de particiones
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una cantidad de memoria válida.");
                return;
            }

            int memoriaTotalAsignada = 0;
            for (int i = 0; i < modelo1.getRowCount(); i++) {
                memoriaTotalAsignada += Integer.parseInt(modelo1.getValueAt(i, 1).toString());
            }
            memoriaTotalAsignada += memoriaAsignada;

            if (memoriaTotalAsignada > cantidadTotalMemoria) {
                JOptionPane.showMessageDialog(this, "La suma de la memoria asignada supera la memoria total disponible.");
                return;
            }
            contadorParticiones++;//contador de particiones
             Vector v = new Vector();
             v.addElement(contadorParticiones);
             v.addElement(x.detalleMemoria.getText());
             //Agregar al modelo
             modelo1.addRow(v);
             int memoriaRestante = cantidadTotalMemoria - memoriaTotalAsignada;
             memRestante.setText(String.valueOf(memoriaRestante));
             if (contadorParticiones == nParticiones) {
                // Calcular y mostrar la memoria restante
                if (memoriaRestante > 0) {
                    JOptionPane.showMessageDialog(this, "No puede sobrar memoria, asigne más memoria a las particiones.");
                }
             }
            }catch(NumberFormatException e) 
              {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.");
              }
        
        
    }//GEN-LAST:event_btnAsignartpActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        pantallaSimulacion psim = new pantallaSimulacion();
        this.setVisible(false);
        this.dispose();
        psim.setVisible(true);
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaParticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaParticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaParticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaParticion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaParticion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField NumPartTP;
    private javax.swing.JButton btnAsignartp;
    public javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField memRestante;
    private javax.swing.JTextField polUbiTP;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    public javax.swing.JTextField totalMemTP;
    // End of variables declaration//GEN-END:variables
}
