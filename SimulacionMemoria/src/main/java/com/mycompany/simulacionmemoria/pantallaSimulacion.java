
package com.mycompany.simulacionmemoria;

//Imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;



public class pantallaSimulacion extends javax.swing.JFrame {
    //datos globales de JFrame pantallaSimulacion
    DatosGlobales datosPsim = DatosGlobales.obtenerInstancia();
    int numeroParticiones = datosPsim.getNumeroParticiones();
    String politicaUbicacion = datosPsim.getPoliticaUbicacion();
    private ArrayList<claseParticion> particiones;
    private LinkedList<claseProcesos> procesos;
    
    //Personalizacion de colores
    Color colorLibre = new Color(0,204,0); //Verde
    Color colorEnUso = new Color(255, 204, 0);//Amarillo
    //Maximo de particiones es 20, se hará un vector 5x4
    int maxFilas = 5;
    int maxColumnas = 4;
    //TablaProcesos
    private javax.swing.JTable tablaProcesos;

    private pantallaProcesos pantallaProcesosInstancia;
    public pantallaSimulacion() {
        initComponents();
        //procesos = new LinkedList<>();
        particiones = new ArrayList<>();
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        pantallaProcesosInstancia = new pantallaProcesos(); //Instanciar pantalla para registrar un proceso
        this.setVisible(true);//Mantener visible esta pantalla
        pantallaProcesosInstancia.setVisible(true);//Hacer visible el otro JFrame
        
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
    LinkedList<claseProcesos> procesosRegistrados = pantallaProcesosInstancia.getProcesosRegistrados();
        // Iterar sobre los procesos registrados e imprimir sus nombres y memoria requerida
        for (claseProcesos proceso : procesosRegistrados) {
            System.out.println("Nombre del Proceso: " + proceso.getNombreProceso());
            System.out.println("Memoria Requerida: " + proceso.getMemoriaRequerida());
        }
    }//GEN-LAST:event_btnSimularActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Cálculo de dimensiones
        //JPanel1 es el JPanel que está sobre el JFrame
        int anchoPanelHijo = jPanel1.getWidth() / maxColumnas;
        int altoPanelHijo = jPanel1.getHeight() / maxFilas;
        this.procesos = new LinkedList<>();
        int numeroParticiones = datosPsim.getNumeroParticiones(); // Obtener número de particiones del objeto DatosGlobales
        int totalParticionesAMostrar = Math.min(numeroParticiones, maxColumnas * maxFilas);
        // Bucle for anidado para crear la matriz de paneles
        // Bucle for anidado para crear la matriz de paneles
    for (int i = 0; i < maxFilas; i++) {
        for (int j = 0; j < maxColumnas; j++) {
            // Calcular el índice del panel actual
            int indicePanel = i * maxColumnas + j;
            JLabel numParticion = new JLabel("Particion " + (indicePanel + 1));
            
            JLabel libre = new JLabel("Libre");
            
            JLabel porcentaje = new JLabel("Porcentaje: " + (indicePanel * 10) + "%");
            // Solo crear paneles si el índice es menor que el número de particiones
            if (indicePanel < totalParticionesAMostrar) {
                JPanel panelParticion = new JPanel();
                panelParticion.setLayout(new BoxLayout(panelParticion, BoxLayout.Y_AXIS)); // Establecer layout vertical
                panelParticion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelParticion.setPreferredSize(new Dimension(anchoPanelHijo, altoPanelHijo));
                panelParticion.setBackground(colorLibre); 
                panelParticion.add(numParticion);
                panelParticion.add(libre);
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
