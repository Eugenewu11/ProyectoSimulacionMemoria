
package com.mycompany.simulacionmemoria;

//Imports
import javax.swing.JOptionPane;
public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        totalMemoria = new javax.swing.JTextField();
        nParticion = new javax.swing.JTextField();
        politicas = new javax.swing.JComboBox<>();
        tmin = new javax.swing.JTextField();
        tmax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Personalizacón de parámetros para la simulación de memoria");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad total de memoria a asignar:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Número total de particiones a asignar:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Políticas de ubicación a asignar:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Seg");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese intervarlos de tiempo que durarán los procesos");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tiempo Máximo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tiempo Mínimo:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("GB");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Seg");

        btnSiguiente.setBackground(new java.awt.Color(51, 204, 0));
        btnSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        totalMemoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalMemoria.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        nParticion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nParticion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        politicas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        politicas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Mejor Ajuste", "Primer Ajuste" }));

        tmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tmax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tmax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(politicas, javax.swing.GroupLayout.Alignment.LEADING, 0, 176, Short.MAX_VALUE)
                                        .addComponent(nParticion, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tmin, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(tmax))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(totalMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nParticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(politicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        try{
            int cantidadMemoriatot = Integer.parseInt(totalMemoria.getText());
            int numParticiones = Integer.parseInt(nParticion.getText());
            int tiempoMin = Integer.parseInt(tmin.getText());
            int tiempoMax = Integer.parseInt(tmax.getText());

            
            // Validar que los campos no estén vacíos
            if (totalMemoria.getText().isEmpty() || nParticion.getText().isEmpty() || tmin.getText().isEmpty() 
                || tmax.getText().isEmpty()|| politicas.getSelectedIndex() == 0) //La posición 0 sería "Seleccionar..."
            {
                //Si los campos estan vacíos se mostrará un error
                JOptionPane.showMessageDialog(this, "Obligatorio llenar los campos", "Error!", JOptionPane.ERROR_MESSAGE);
            }else
                {
                    //Validar que los valores que se ingresen no sean negativos
                  if (cantidadMemoriatot <= 0 || numParticiones <= 0 || tiempoMin < 0 || tiempoMax <= 0) 
                  {
                      //Si son negativos se mostrará este error
                    JOptionPane.showMessageDialog(this, "Los campos solo pueden ser positivos y enteros", "Error!", JOptionPane.ERROR_MESSAGE);
                  }else {
                         //validar que el tiempo maximo no sea menor que el minimo
                         if(tiempoMin > tiempoMax)
                        {
                            JOptionPane.showMessageDialog(this, "El tiempo mínimo no puede ser mmayor que el máximo", "Error!", JOptionPane.ERROR_MESSAGE);
                        }else
                            {
                             if(cantidadMemoriatot > 10000 || numParticiones > 20)
                                {
                                     JOptionPane.showMessageDialog(this, "El maximo de memoria permitido es 10,000, maximo de particiones es 20.", "Error!", JOptionPane.ERROR_MESSAGE);
                                }
                                 else
                                    {    
                                         //Validar que la política de partición sea seleccionada
                                         String politicaSeleccionada = politicas.getSelectedItem().toString();
                                         if (!politicaSeleccionada.equals("Mejor Ajuste") && !politicaSeleccionada.equals("Primer Ajuste")) 
                                         {
                                             JOptionPane.showMessageDialog(this, "No se seleccionó política de ubicación", "Error!", JOptionPane.ERROR_MESSAGE);
                                              }else
                                         {
                                            //Si todo se cumple entonces
                                            //instanciar la clase global para recoger datos
                                            DatosGlobales datosMenu = DatosGlobales.obtenerInstancia();
                                            //obtenerlos de los textfield y guardarlos
                                            datosMenu.setCantidadTotalMemoria(cantidadMemoriatot);
                                            datosMenu.setNumeroParticiones(numParticiones);
                                            datosMenu.setPoliticaUbicacion(politicaSeleccionada);
                                            datosMenu.setTiempoMaximo(tiempoMax);
                                            datosMenu.setTiempoMinimo(tiempoMin);
                                            //Mandar a llamar la siguiente pantalla del proyecto
                                            TablaParticion tablaParticion = new TablaParticion();
                                            this.setVisible(false);//Pantalla Menu ya no será visible
                                            this.dispose();//Se elimina de la RAM
                                            tablaParticion.setVisible(true);//Muestro la siguiente pantalla TablaParticion
                                         }
                                    }    
                            }
                        }
                }
                              
        } catch (NumberFormatException ex) {
            // Capturar error si se ingresa un valor no numérico en los campos de texto
            JOptionPane.showMessageDialog(this, "No cumple con los parametros", "Error!", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            // Capturar error si no se cumple ninguna de las validaciones
            JOptionPane.showMessageDialog(this, "No se cumplen las validaciones", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField nParticion;
    public javax.swing.JComboBox<String> politicas;
    public javax.swing.JTextField tmax;
    public javax.swing.JTextField tmin;
    public javax.swing.JTextField totalMemoria;
    // End of variables declaration//GEN-END:variables
}
