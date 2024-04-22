
package com.mycompany.simulacionmemoria;

//Imports
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class pantallaSimulacion extends javax.swing.JFrame {
    //datos globales de JFrame pantallaSimulacion
    DatosGlobales datosPsim = DatosGlobales.obtenerInstancia();
    int numeroParticiones = datosPsim.getNumeroParticiones();
    String politicaUbicacion = datosPsim.getPoliticaUbicacion();
    private ArrayList<claseParticion> particiones;
    private LinkedList<claseProcesos> procesos;
    DefaultTableModel modeloSim;
    //Personalizacion de colores
    Color colorLibre = new Color(0,204,0); //Verde
    Color colorEnUso = new Color(255, 204, 0);//Amarillo
    //Maximo de particiones es 20, se hará un vector 5x4
    int maxFilas = 5;
    int maxColumnas = 4;
    private ArrayList<JTextField> txtFieldParticiones;
    private clasePaneles panelesParticiones;
    
    public pantallaSimulacion() {
        initComponents();
        //procesos = new LinkedList<>();
        particiones = new ArrayList<>();
        panelesParticiones = new clasePaneles(particiones, procesos);
        txtFieldParticiones = new ArrayList<>();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JButton();
        btnSimular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProcesosSim = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Simulación de Memoria");

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        btnRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistro.setText("Registro de Proceso");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnSimular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        tablaProcesosSim.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProcesosSim);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(538, 538, 538))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        detalleProcesos y = new detalleProcesos(this,true);
        y.setVisible(true);
        if( y.getRootPane() != null ){
            if(!y.nombreProceso.getText().isEmpty() && !y.memRequerida.getText().isEmpty())
            {
                String nombreProceso = y.nombreProceso.getText();
                //Id que se vaya enumerando de 1 en 1
                int id = modeloSim.getRowCount() + 1;
                int memoriaRequerida = Integer.parseInt(y.memRequerida.getText());
                int tiempoRequerido = (int) (Math.random() * (DatosGlobales.obtenerInstancia().getTiempoMaximo() - DatosGlobales.obtenerInstancia().getTiempoMinimo()) + DatosGlobales.obtenerInstancia().getTiempoMinimo());
                //Instanciar clase
                claseProcesos proceso = new claseProcesos(nombreProceso, modeloSim.getRowCount() + 1, "En espera", memoriaRequerida, tiempoRequerido, 0);
                //Agregamos la info a la linkedList de procesos
                procesos.add(proceso);
                //Hacemos que se agregue la fila con la informacion
                modeloSim.addRow(new Object[]{id, nombreProceso, memoriaRequerida, "En espera", tiempoRequerido, 0});
            }else
            {
                JOptionPane.showMessageDialog(this, "Se requiere nombre de proceso y memoria requerida.");
            }
        }        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed

        claseHilo hiloSimulacion = new claseHilo(procesos, particiones, txtFieldParticiones.get(0), modeloSim, tablaProcesosSim);
        hiloSimulacion.start();
    }//GEN-LAST:event_btnSimularActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    //Tabla donde se registraran los procesos    
    //inicializar modelo de datos
    modeloSim = new DefaultTableModel()
        {
            //Evitar poder editar las celdas del JTable
            public boolean isCellEditable(int rowIndex, int mColIndex){
            return false;
        }
      };
       modeloSim.addColumn("ID");//0
       modeloSim.addColumn("Nombre Proceso");//1
       modeloSim.addColumn("Memoria Requerida");//2
       modeloSim.addColumn("Estado");//3
       modeloSim.addColumn("Tiempo Req.");//4
       modeloSim.addColumn("Duración");//5
       //Estblacer el modelo
       tablaProcesosSim.setModel(modeloSim);
       //Personalización de anchos por columna
       tablaProcesosSim.getColumnModel().getColumn(0).setMaxWidth(50);
       tablaProcesosSim.getColumnModel().getColumn(0).setPreferredWidth(50);
       tablaProcesosSim.getColumnModel().getColumn(1).setMaxWidth(150);
       tablaProcesosSim.getColumnModel().getColumn(1).setPreferredWidth(150);  
       tablaProcesosSim.getColumnModel().getColumn(2).setMaxWidth(150);
       tablaProcesosSim.getColumnModel().getColumn(2).setPreferredWidth(150);  
       tablaProcesosSim.getColumnModel().getColumn(3).setMaxWidth(120);
       tablaProcesosSim.getColumnModel().getColumn(3).setPreferredWidth(120);  
       tablaProcesosSim.getColumnModel().getColumn(4).setMaxWidth(105);
       tablaProcesosSim.getColumnModel().getColumn(4).setPreferredWidth(105);  
       tablaProcesosSim.getColumnModel().getColumn(5).setMaxWidth(100);
       tablaProcesosSim.getColumnModel().getColumn(5).setPreferredWidth(100); 
             
        // Cálculo de dimensiones
        //JPanel1 es el JPanel que está sobre el JFrame
        int anchoPanelHijo = jPanel1.getWidth() / maxColumnas;
        int altoPanelHijo = jPanel1.getHeight() / maxFilas;
        claseParticion[] particionesArray = claseParticion.crearParticiones(numeroParticiones, datosPsim.getCantidadTotalMemoria());
        //Convertir la Lista a arrayList
        particiones = new ArrayList<>(Arrays.asList(particionesArray));
        procesos = new LinkedList<>();
        int numeroParticiones = datosPsim.getNumeroParticiones(); // Obtener número de particiones del objeto DatosGlobales
        int totalParticionesAMostrar = Math.min(numeroParticiones, maxColumnas * maxFilas);
        double memoriaTotalRequerida = 0.0; // Inicializar la memoria total requerida por los procesos
        // Calcular la memoria total requerida por proceso
        for (claseProcesos proceso : procesos) {
            memoriaTotalRequerida += proceso.getMemoriaRequerida();
        }
        // Bucle for anidado para crear la matriz de paneles
        // Bucle for anidado para crear la matriz de paneles
    for (int i = 0; i < maxFilas; i++) {
        for (int j = 0; j < maxColumnas; j++) {
            // Calcular el índice del panel actual
            int indicePanel = i * maxColumnas + j;
            // Solo crear paneles si el índice es menor que el número de particiones
            if (indicePanel < totalParticionesAMostrar) {
                JPanel panelParticion = new JPanel();
                panelParticion.setLayout(new BoxLayout(panelParticion, BoxLayout.Y_AXIS)); // Establecer layout vertical
                panelParticion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelParticion.setPreferredSize(new Dimension(anchoPanelHijo, altoPanelHijo));
                //panelParticion.setBackground(colorLibre); 
                
                // Crear y configurar los campos de texto
                JTextField txtFieldParticion = new JTextField();
                double porcentaje = 0.0; // Inicializar el porcentaje de uso de la partición
                // Calcular el porcentaje de uso de la partición si hay memoria total requerida por los procesos
                if (memoriaTotalRequerida > 0) {
                    porcentaje = (particionesArray[indicePanel].getTamanio() / memoriaTotalRequerida) * 100;
                }
                txtFieldParticion.setText("Libre \n" + String.format("%.2f", porcentaje) + "%");
                txtFieldParticion.setEditable(false); // No editable
                txtFieldParticion.setBackground(colorLibre);
                txtFieldParticion.setHorizontalAlignment(JTextField.CENTER); // Alinear al centro
                
                // Agregar el campo de texto al arraylist
                txtFieldParticiones.add(txtFieldParticion);
                
                // Añadir el campo de texto al panel
                panelParticion.add(txtFieldParticion);
                
                // Añadir el panel a jPanel1 y establecer su ubicación
                jPanel1.add(panelParticion);
                panelParticion.setBounds(j * anchoPanelHijo, i * altoPanelHijo, anchoPanelHijo, altoPanelHijo);
            }
        }
    }    
    jPanel1.revalidate(); // Revalidar los datos
    jPanel1.repaint();
    }//GEN-LAST:event_formWindowOpened
   //Otros metodos o funciones
    private void agregarTextFieldParticion(JTextField textField) {
        txtFieldParticiones.add(textField);
    }
  
    private int buscarProcesoEnTabla(int idProceso) {
    for (int i = 0; i < modeloSim.getRowCount(); i++) {
        int id = (int) modeloSim.getValueAt(i, 0); // Obtener el ID del proceso en la fila i
        if (id == idProceso) {
            return i; // Devolver el índice si se encuentra el proceso en la tabla
        }
    }
    return -1; // Devolver -1 si el proceso no se encuentra en la tabla
}
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
            java.util.logging.Logger.getLogger(pantallaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaSimulacion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistro;
    public javax.swing.JButton btnSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProcesosSim;
    // End of variables declaration//GEN-END:variables
}
