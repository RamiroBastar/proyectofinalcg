/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Juan
 */
public class PrincipalSucursal extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalSucursal
     */
    public PrincipalSucursal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dialogoAltaSucursal = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        lbNombreAl = new javax.swing.JLabel();
        lbDireccionAl = new javax.swing.JLabel();
        lbClaveAl = new javax.swing.JLabel();
        lbTelefonoAl = new javax.swing.JLabel();
        tfNombreAl = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDireccionAl = new javax.swing.JTextArea();
        tfClaveAl = new javax.swing.JTextField();
        tfTelefonoAl = new javax.swing.JTextField();
        btnGrabarAl = new javax.swing.JButton();
        btnInicializarAl = new javax.swing.JButton();
        btnRegresarAl = new javax.swing.JButton();
        dialogoActualizaSucursal = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        lbNombreAc = new javax.swing.JLabel();
        jlDireccionAc = new javax.swing.JLabel();
        lbClaveAc = new javax.swing.JLabel();
        lbTelefonoAc = new javax.swing.JLabel();
        tfNombreAc = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        taDireccionAc = new javax.swing.JTextArea();
        tfClaveAc = new javax.swing.JTextField();
        tfTelefonoAc = new javax.swing.JTextField();
        btnGrabarAc = new javax.swing.JButton();
        btnRegresarAc = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Alta SUCURSAL");

        lbNombreAl.setText("Nombre:");

        lbDireccionAl.setText("Direccion:");

        lbClaveAl.setText("Clave:");

        lbTelefonoAl.setText("Telefono:");

        taDireccionAl.setColumns(20);
        taDireccionAl.setRows(5);
        jScrollPane3.setViewportView(taDireccionAl);

        tfClaveAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClaveAlActionPerformed(evt);
            }
        });

        tfTelefonoAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoAlActionPerformed(evt);
            }
        });

        btnGrabarAl.setText("GRABAR");
        btnGrabarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarAlActionPerformed(evt);
            }
        });

        btnInicializarAl.setText("Inicializar");

        btnRegresarAl.setText("<--Regresar");

        javax.swing.GroupLayout dialogoAltaSucursalLayout = new javax.swing.GroupLayout(dialogoAltaSucursal.getContentPane());
        dialogoAltaSucursal.getContentPane().setLayout(dialogoAltaSucursalLayout);
        dialogoAltaSucursalLayout.setHorizontalGroup(
            dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                                .addComponent(lbClaveAl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfClaveAl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                                .addComponent(lbTelefonoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfTelefonoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                                .addComponent(lbNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                                .addComponent(lbDireccionAl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnGrabarAl)
                        .addGap(29, 29, 29)
                        .addComponent(btnInicializarAl)
                        .addGap(28, 28, 28)
                        .addComponent(btnRegresarAl)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoAltaSucursalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        dialogoAltaSucursalLayout.setVerticalGroup(
            dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAltaSucursalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreAl)
                    .addComponent(tfNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccionAl))
                .addGap(18, 18, 18)
                .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClaveAl)
                    .addComponent(tfClaveAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefonoAl)
                    .addComponent(tfTelefonoAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(dialogoAltaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabarAl)
                    .addComponent(btnInicializarAl)
                    .addComponent(btnRegresarAl))
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Actualiza SUCURSAL");

        lbNombreAc.setText("Nombre:");

        jlDireccionAc.setText("Direccion:");

        lbClaveAc.setText("Clave:");

        lbTelefonoAc.setText("Telefono:");

        taDireccionAc.setColumns(20);
        taDireccionAc.setRows(5);
        jScrollPane5.setViewportView(taDireccionAc);

        btnGrabarAc.setText("GRABAR");

        btnRegresarAc.setText("<--REGRESAR");

        javax.swing.GroupLayout dialogoActualizaSucursalLayout = new javax.swing.GroupLayout(dialogoActualizaSucursal.getContentPane());
        dialogoActualizaSucursal.getContentPane().setLayout(dialogoActualizaSucursalLayout);
        dialogoActualizaSucursalLayout.setHorizontalGroup(
            dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3))
                    .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                                .addComponent(lbNombreAc)
                                .addGap(18, 18, 18)
                                .addComponent(tfNombreAc, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDireccionAc)
                                    .addComponent(lbClaveAc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfClaveAc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                                .addComponent(lbTelefonoAc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                                        .addComponent(btnGrabarAc)
                                        .addGap(90, 90, 90)
                                        .addComponent(btnRegresarAc))
                                    .addComponent(tfTelefonoAc, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        dialogoActualizaSucursalLayout.setVerticalGroup(
            dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoActualizaSucursalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreAc)
                    .addComponent(tfNombreAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDireccionAc)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbClaveAc)
                    .addComponent(tfClaveAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefonoAc)
                    .addComponent(tfTelefonoAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(dialogoActualizaSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabarAc)
                    .addComponent(btnRegresarAc))
                .addGap(44, 44, 44))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Control de SUCURSAL");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        btnAlta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlta.setText("ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBaja.setText("BAJA");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRefresh.setText("Refresh");

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegresar.setText("<---- Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlta)
                    .addComponent(btnRefresh)
                    .addComponent(btnActualizar)
                    .addComponent(btnBaja))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAlta)
                        .addGap(41, 41, 41)
                        .addComponent(btnBaja)
                        .addGap(32, 32, 32)
                        .addComponent(btnActualizar)))
                .addGap(13, 13, 13)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here
        Menu m = new Menu();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // TODO add your handling code here:
        dialogoAltaSucursal.setSize(500, 500);
        dialogoAltaSucursal.setVisible(true);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBajaActionPerformed

    private void tfClaveAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClaveAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClaveAlActionPerformed

    private void tfTelefonoAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoAlActionPerformed

    private void btnGrabarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGrabarAlActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        dialogoActualizaSucursal.setSize(500, 500);
        dialogoActualizaSucursal.setVisible(true);
        
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnGrabarAc;
    private javax.swing.JButton btnGrabarAl;
    private javax.swing.JButton btnInicializarAl;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresarAc;
    private javax.swing.JButton btnRegresarAl;
    private javax.swing.JDialog dialogoActualizaSucursal;
    private javax.swing.JDialog dialogoAltaSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlDireccionAc;
    private javax.swing.JLabel lbClaveAc;
    private javax.swing.JLabel lbClaveAl;
    private javax.swing.JLabel lbDireccionAl;
    private javax.swing.JLabel lbNombreAc;
    private javax.swing.JLabel lbNombreAl;
    private javax.swing.JLabel lbTelefonoAc;
    private javax.swing.JLabel lbTelefonoAl;
    private javax.swing.JTextArea taDireccionAc;
    private javax.swing.JTextArea taDireccionAl;
    private javax.swing.JTextField tfClaveAc;
    private javax.swing.JTextField tfClaveAl;
    private javax.swing.JTextField tfNombreAc;
    private javax.swing.JTextField tfNombreAl;
    private javax.swing.JTextField tfTelefonoAc;
    private javax.swing.JTextField tfTelefonoAl;
    // End of variables declaration//GEN-END:variables
}
