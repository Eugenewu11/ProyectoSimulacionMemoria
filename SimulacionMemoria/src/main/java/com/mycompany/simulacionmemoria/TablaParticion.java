
package com.mycompany.simulacionmemoria;

//Imports
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JOptionPane;

public class TablaParticion extends javax.swing.JFrame {
   //Declarar variables publicas dentro de JFrame TablaPartición
   DefaultTableModel modelo1; //Permitirá hacer cambios personalizados a JTables
   DatosGlobales datosTablaP = DatosGlobales.obtenerInstancia();//Instancia de singleton DatosGlobales
   private int cantidadTotalMemoria;
   private int numeroParticiones;
   private String politicaUbicacion;
   private int contadorParticiones = 0;
   private ArrayList<claseParticion> particiones = new ArrayList<>();
   private int mayorTamanioParticion = 0;
      
    public TablaParticion(){
    initComponents();
    //Traer la información que se digitó en Menu a los TextFields de esta pantalla
        cantidadTotalMemoria = datosTablaP.getCantidadTotalMemoria();
        numeroParticiones = datosTablaP.getNumeroParticiones();
        politicaUbicacion = datosTablaP.getPoliticaUbicacion();
        totalMemTP.setText(String.valueOf(cantidadTotalMemoria));
        NumPartTP.setText(String.valueOf(numeroParticiones));
        polUbiTP.setText(politicaUbicacion); 
    }
    
     public int getMayorTamanioParticion() {
        return mayorTamanioParticion;        
    }
    
    private void updateTableModel() {
        // Clear existing table data
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
         model.setRowCount(0);

          // Add data from particiones list
        for (claseParticion p : particiones) {
          model.addRow(new Object[]{p.getNumeroParticion(), p.getTamanio()});
        }
    }

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
        btnEditar = new javax.swing.JButton();

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

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAsignartp, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAsignartp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
       //Crear columnas personalizadas
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
        
        //Instanciar JDialog detalleTp
        detalleTp x = new detalleTp(this,true);
        x.setVisible(true);//Mostrarlo
        
        //Si no se da click en btnCancelar
        if (x.getRootPane() != null)
            try{
                 int nParticiones = Integer.parseInt(NumPartTP.getText());
                 if (nParticiones <= 0) { //Validar si en verdad hay particiones
                    JOptionPane.showMessageDialog(this, "El número de particiones debe ser mayor que cero.");
                    return;
                 } 
                 int totalFilas = modelo1.getRowCount();//Obtenemos el numero de filas que se han ido creando
                 if (totalFilas >= nParticiones) //Una vez se haya asignada memoria a todas las particiones se deshabilita la opcion de btnAgregar
                 {
                    JOptionPane.showMessageDialog(this, "Se ha alcanzado el límite de particiones.");
                    btnAsignartp.setVisible(false); 
                    return;
                 }
                 //Validar que el contador de particiones no sea mayor que las n particiones asignadas
                 if (contadorParticiones > nParticiones) {
                    JOptionPane.showMessageDialog(this, "No se pueden agregar más particiones.");
                    return;
                }
                 int memoriaAsignada = 1; // Valor predeterminado si no se ingresa nada
            try {
                memoriaAsignada = Integer.parseInt(x.detalleMemoria.getText());
                if (memoriaAsignada <= 0) {
                    JOptionPane.showMessageDialog(this, "La cantidad de memoria asignada debe ser mayor que cero.");
                    contadorParticiones--;//contador de particiones disminuye
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una cantidad de memoria válida.");
                return;
            }
            //Contador para la suma total de todas las memorias de las particiones
            int memoriaTotalAsignada = 0;
            //Variable que se irá sumando cada vez que se ingrese memoria a una partición
            for (int i = 0; i < modelo1.getRowCount(); i++) {
                memoriaTotalAsignada += Integer.parseInt(modelo1.getValueAt(i, 1).toString());
            }
            memoriaTotalAsignada += memoriaAsignada;
            //Memoria asignada no puede ser mayor que la total
            if (memoriaTotalAsignada > cantidadTotalMemoria) {
                JOptionPane.showMessageDialog(this, "La suma de la memoria asignada supera la memoria total disponible.");
                return;
            }
            contadorParticiones++;//contador de particiones
            
            // Encontrar el tamaño de la partición más grande
            for (claseParticion particionTp : particiones) {
            if (particionTp.getTamanio() > mayorTamanioParticion) {
            mayorTamanioParticion = particionTp.getTamanio();
                }
            }
            System.out.println("Tamaño de la partición más grande: " + mayorTamanioParticion);

            Vector v = new Vector();
            v.addElement(contadorParticiones);
            v.addElement(x.detalleMemoria.getText());
            // Agregar al modelo
            modelo1.addRow(v);

            // Crear la nueva partición y agregarla a la lista de particiones
            claseParticion nuevaParticion = new claseParticion(contadorParticiones + "", memoriaAsignada);
            particiones.add(nuevaParticion);
            claseParticion.agregarParticion(nuevaParticion);

            // Actualizar el modelo de la tabla
            updateTableModel();

            //Variable para TextField Memoria que va sobrando
            int memoriaRestante = cantidadTotalMemoria;
            for (claseParticion particion : particiones) {
                memoriaRestante -= particion.getTamanio();
            }
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
        //Instanciar siguiente pantalla del Proyecto
        pantallaSimulacion psim = new pantallaSimulacion();
        this.setVisible(false);//No hacemos visible la pantalla actual
        this.dispose();//La eliminamos de la RAM
        psim.setVisible(true);//Hacemos visible la siguiente pantalla pantallaSimulación
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();
    
    // Verificar si se seleccionó una fila
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una partición para editar.");
        return;
    }
    
    // Obtener la partición seleccionada
    claseParticion particionSeleccionada = particiones.get(filaSeleccionada);
    
    // Crear un diálogo para editar la cantidad de memoria asignada
    String nuevaMemoriaString = JOptionPane.showInputDialog(this, "Ingrese la nueva cantidad de memoria asignada:");
    
    // Validar si se canceló la edición o si se ingresó una cantidad inválida
    if (nuevaMemoriaString == null || nuevaMemoriaString.isEmpty()) {
        return; // Cancelar la operación si se cerró el diálogo o no se ingresó nada
    }
    
    // Convertir la nueva cantidad de memoria a entero
    int nuevaMemoria;
    try {
        nuevaMemoria = Integer.parseInt(nuevaMemoriaString);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una cantidad de memoria válida.");
        return;
    }
    
    // Validar si la nueva cantidad de memoria es válida
    if (nuevaMemoria < 0) {
        JOptionPane.showMessageDialog(this, "La cantidad de memoria asignada no puede ser menor que cero.");
        return;
    }
    
    // Calcular la memoria total asignada actualmente
    int memoriaTotalAsignada = 0;
    for (claseParticion particion : particiones) {
        memoriaTotalAsignada += particion.getTamanio();
    }
    
    // Restar el tamaño original de la partición editada
    memoriaTotalAsignada -= particionSeleccionada.getTamanio();
    
    // Verificar si la nueva cantidad de memoria supera la memoria total
    if (nuevaMemoria > cantidadTotalMemoria - memoriaTotalAsignada) {
        JOptionPane.showMessageDialog(this, "La suma de la memoria asignada supera la memoria total disponible.");
        return;
    }
    
    // Actualizar la cantidad de memoria asignada en la partición seleccionada
    particionSeleccionada.setTamanio(nuevaMemoria);
    
    // Recalcular la memoria total asignada
    memoriaTotalAsignada += nuevaMemoria;
    
    // Calcular y mostrar la memoria restante
    int memoriaRestante = cantidadTotalMemoria - memoriaTotalAsignada;
    memRestante.setText(String.valueOf(memoriaRestante));
    if (memoriaRestante < 0) {
        JOptionPane.showMessageDialog(this, "No puede sobrar memoria, asigne menos memoria a las particiones.");
    }
    
    // Actualizar el modelo de la tabla
    updateTableModel();
    }//GEN-LAST:event_btnEditarActionPerformed

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
    public javax.swing.JButton btnEditar;
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
