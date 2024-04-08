
package com.mycompany.simulacionmemoria;

//Imports
import java.awt.Color;
import java.awt.Dimension;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;



public class pantallaSimulacion extends javax.swing.JFrame {
    //datos globales de JFrame pantallaSimulacion
    //clase global de proyecto
    DatosGlobales datosPsim = DatosGlobales.obtenerInstancia();
    int numeroParticiones = datosPsim.getNumeroParticiones();
    //Lista para procesos
     public LinkedList<Procesos> procesos;
    //Personalizacion de colores
    Color color1 = new Color(0,153,0);
    //Maximo de particiones es 20, se hará un vector 5x4
    int maxFilas = 5;
    int maxColumnas = 4;
    //TablaProcesos
    private javax.swing.JTable tablaProcesos;
    private int duracionActual;
    public pantallaSimulacion() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JButton();
        btnSimular = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnSimular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        pantallaProcesos procesos = new pantallaProcesos(); //Instanciar pantalla para registrar un proceso
        this.setVisible(true);//Mantener visible esta pantalla
        procesos.setVisible(true);//Hacer visible el otro JFrame
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        Thread simulacionThread = new Thread(() -> {
            // Recorrer la lista de procesos y simular su ejecución
            for (Procesos proceso : procesos) {
                // Cambiar el estado del proceso a "En espera"
                proceso.setEstado("En espera");
                // Actualizar la interfaz gráfica con el estado del proceso
                actualizarInterfazGrafica(proceso);
                // Esperar el tiempo requerido antes de iniciar el proceso
                try {
                    Thread.sleep(proceso.getTiempoRequerido() * 1000); // Convertir segundos a milisegundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Cambiar el estado del proceso a "En memoria"
                proceso.setEstado("En ejecucion");
                // Actualizar la interfaz gráfica con el estado del proceso
                actualizarInterfazGrafica(proceso);
                // Iniciar el temporizador para la duración del proceso
                Timer duracionTimer = new Timer(1000, new java.awt.event.ActionListener() {
                    int duracionActual = 0;

                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        // Actualizar la duración del proceso en la interfaz gráfica
                        duracionActual++;
                        proceso.setDuracionProceso(duracionActual);
                        actualizarInterfazGrafica(proceso);
                        // Verificar si el proceso ha terminado
                        if (duracionActual >= proceso.getDuracionProceso()) {
                            // Detener el temporizador
                            ((Timer) evt.getSource()).stop();
                            // Cambiar el estado del proceso a "Terminado"
                            proceso.setEstado("Terminado");
                            // Actualizar la interfaz gráfica con el estado del proceso
                            actualizarInterfazGrafica(proceso);
                        }
                    }
                });
                duracionTimer.start();
            }
        });
        simulacionThread.start();
    }//GEN-LAST:event_btnSimularActionPerformed
private void actualizarInterfazGrafica(Procesos proceso) {
  DefaultTableModel model = (DefaultTableModel) tablaProcesos.getModel();
  for (int i = 0; i < model.getRowCount(); i++) {
    if ((int) model.getValueAt(i, 0) == proceso.getIdProceso()) {
      model.setValueAt("En memoria", i, 3); // Actualizar estado
      proceso.setDuracionProceso(duracionActual); // Actualizar duración
      model.setValueAt(proceso.getDuracionProceso(), i, 5); // Actualizar "Duración"
      break;
    }
  }
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Cálculo de dimensiones
        //JPanel1 es el JPanel que está sobre el JFrame
        int anchoPanelHijo = jPanel1.getWidth() / maxColumnas;
        int altoPanelHijo = jPanel1.getHeight() / maxFilas;
        this.procesos = new LinkedList<>();
        int numeroParticiones = datosPsim.getNumeroParticiones(); // Obtener número de particiones del objeto DatosGlobales
        int totalParticionesAMostrar = Math.min(numeroParticiones, maxColumnas * maxFilas);
        // Bucle for anidado para crear la matriz de paneles
        for (int i = 0; i < maxFilas; i++) {
            for (int j = 0; j < maxColumnas; j++) {
                // Calcular el índice del panel actual
                int indicePanel = i * maxColumnas + j;
                JLabel nombreProceso = new JLabel("Nombre proceso " + (indicePanel + 1));
                JLabel porcentaje = new JLabel("Porcentaje: " + (indicePanel * 10) + "%");

                // Solo crear paneles si el índice es menor que el número de particiones
                if (indicePanel < totalParticionesAMostrar) {
                    JPanel panelParticion = new JPanel();
                    panelParticion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    panelParticion.setPreferredSize(new Dimension(anchoPanelHijo, altoPanelHijo));
                    panelParticion.setBackground(color1);
                    panelParticion.add(nombreProceso);
                    panelParticion.add(porcentaje);
                    // Agregar el panel a jPanel1 y establecer su ubicación
                    jPanel1.add(panelParticion);
                    panelParticion.setBounds(j * anchoPanelHijo, i * altoPanelHijo, anchoPanelHijo, altoPanelHijo);
                }
            }
        }   
    jPanel1.revalidate(); //Revalidar los datos
    jPanel1.repaint();//Re dibujamos en el instante para que aparezcan los nuevos paneles
    }//GEN-LAST:event_formWindowOpened
  
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
    // End of variables declaration//GEN-END:variables
}
