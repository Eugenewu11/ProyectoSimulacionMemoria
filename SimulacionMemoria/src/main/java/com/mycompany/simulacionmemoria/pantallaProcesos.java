
package com.mycompany.simulacionmemoria;

/**
 *
 * @author genew
 */
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class pantallaProcesos extends javax.swing.JFrame {
   DefaultTableModel modelo;

    public pantallaProcesos() {
        initComponents();
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
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       //inicializar modelo de dato
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
       
       tablaProcesos.setModel(modelo);
       
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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(pantallaProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaProcesos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
