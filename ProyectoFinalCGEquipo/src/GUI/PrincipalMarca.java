/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import JDBC.MarcaJDBC;
import POJO.MarcaPOJO;
import javax.swing.JOptionPane;

/**
 *
 * @author MiguelAngel
 */
public class PrincipalMarca extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalMarca
     */
    public PrincipalMarca() {
        initComponents();
        cargarTabla();
    }
    
       public void cargarTabla(){
    tbMarca.setModel(MarcaJDBC.cargarTabla());
    }
       
        private void limpiaDialogoAlta(){
    tfNombreAl.setText(null);
    taDescripcionAl.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoAltaMarca = new javax.swing.JDialog();
        lbAlta = new javax.swing.JLabel();
        lbNombreAl = new javax.swing.JLabel();
        tfNombreAl = new javax.swing.JTextField();
        lbDescripcionAl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescripcionAl = new javax.swing.JTextArea();
        btnGuardarAl = new javax.swing.JButton();
        btnCancelarAl = new javax.swing.JButton();
        dialogoActualizarMarca = new javax.swing.JDialog();
        lbActualizar = new javax.swing.JLabel();
        lbIdAc = new javax.swing.JLabel();
        lbNombreAc = new javax.swing.JLabel();
        lbDescripcionAc = new javax.swing.JLabel();
        tfIdAc = new javax.swing.JTextField();
        tfNombreAc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDescripcionAc = new javax.swing.JTextArea();
        btnGuardarAc = new javax.swing.JButton();
        btnCancelarAc = new javax.swing.JButton();
        lbCantidadDeMarcas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMarca = new javax.swing.JTable();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        lbAlta.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbAlta.setText("Alta Marcas");

        lbNombreAl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbNombreAl.setText("Nombre:");

        tfNombreAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreAlActionPerformed(evt);
            }
        });

        lbDescripcionAl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDescripcionAl.setText("Descripción:");

        taDescripcionAl.setColumns(20);
        taDescripcionAl.setRows(5);
        jScrollPane2.setViewportView(taDescripcionAl);

        btnGuardarAl.setText("Guardar");
        btnGuardarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAlActionPerformed(evt);
            }
        });

        btnCancelarAl.setText("Cancelar");
        btnCancelarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoAltaMarcaLayout = new javax.swing.GroupLayout(dialogoAltaMarca.getContentPane());
        dialogoAltaMarca.getContentPane().setLayout(dialogoAltaMarcaLayout);
        dialogoAltaMarcaLayout.setHorizontalGroup(
            dialogoAltaMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoAltaMarcaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAlta)
                .addGap(171, 171, 171))
            .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(dialogoAltaMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                        .addComponent(lbDescripcionAl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                        .addComponent(lbNombreAl)
                        .addGap(35, 35, 35)
                        .addComponent(tfNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnGuardarAl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarAl)
                .addGap(64, 64, 64))
        );
        dialogoAltaMarcaLayout.setVerticalGroup(
            dialogoAltaMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbAlta)
                .addGap(45, 45, 45)
                .addGroup(dialogoAltaMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreAl)
                    .addComponent(tfNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dialogoAltaMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbDescripcionAl))
                    .addGroup(dialogoAltaMarcaLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(dialogoAltaMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAl)
                    .addComponent(btnCancelarAl))
                .addGap(29, 29, 29))
        );

        lbActualizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbActualizar.setText("Actualizar Marca");

        lbIdAc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbIdAc.setText("ID:");

        lbNombreAc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbNombreAc.setText("Nombre:");

        lbDescripcionAc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbDescripcionAc.setText("Descripción:");

        tfIdAc.setEditable(false);

        taDescripcionAc.setColumns(20);
        taDescripcionAc.setRows(5);
        jScrollPane3.setViewportView(taDescripcionAc);

        btnGuardarAc.setText("Guardar");
        btnGuardarAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAcActionPerformed(evt);
            }
        });

        btnCancelarAc.setText("Cancelar");
        btnCancelarAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoActualizarMarcaLayout = new javax.swing.GroupLayout(dialogoActualizarMarca.getContentPane());
        dialogoActualizarMarca.getContentPane().setLayout(dialogoActualizarMarcaLayout);
        dialogoActualizarMarcaLayout.setHorizontalGroup(
            dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoActualizarMarcaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbActualizar)
                .addGap(134, 134, 134))
            .addGroup(dialogoActualizarMarcaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdAc)
                    .addComponent(lbNombreAc)
                    .addComponent(lbDescripcionAc))
                .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoActualizarMarcaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfIdAc, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(tfNombreAc)))
                    .addGroup(dialogoActualizarMarcaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(dialogoActualizarMarcaLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnGuardarAc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarAc)
                .addGap(97, 97, 97))
        );
        dialogoActualizarMarcaLayout.setVerticalGroup(
            dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoActualizarMarcaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbActualizar)
                .addGap(29, 29, 29)
                .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdAc)
                    .addComponent(tfIdAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreAc)
                    .addComponent(tfNombreAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescripcionAc)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(dialogoActualizarMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAc)
                    .addComponent(btnCancelarAc))
                .addGap(32, 32, 32))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCantidadDeMarcas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbCantidadDeMarcas.setText("Cantidad de Marcas");

        tbMarca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbMarca);

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBaja.setText("Baja");

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lbCantidadDeMarcas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegresar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbCantidadDeMarcas)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlta)
                        .addGap(49, 49, 49)
                        .addComponent(btnBaja)
                        .addGap(39, 39, 39)
                        .addComponent(btnActualizar)
                        .addGap(83, 83, 83)
                        .addComponent(btnRefresh)))
                .addGap(25, 25, 25)
                .addComponent(btnRegresar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreAlActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

         Menu x=new Menu();
        x.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed

        dialogoAltaMarca.setSize(471, 429);
        dialogoAltaMarca.setLocationRelativeTo(null);
        dialogoAltaMarca.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
  int filaSeleccionada=tbMarca.getSelectedRow();
        if (filaSeleccionada==-1) {
            JOptionPane.showMessageDialog(null, "Primero selecciona una fila");
        } else {
            String id=tbMarca.getValueAt(filaSeleccionada, 0).toString();
            String nombre=tbMarca.getValueAt(filaSeleccionada, 1).toString();
            String descripcion=tbMarca.getValueAt(filaSeleccionada, 2).toString();
            //Nesecito los componentes del dialogo2
            tfIdAc.setText(id);
            tfNombreAc.setText(nombre);
            taDescripcionAc.setText(descripcion);
            dialogoActualizarMarca.setSize(471,429);
            dialogoActualizarMarca.setLocationRelativeTo(null);
            dialogoActualizarMarca.setVisible(true);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAlActionPerformed

         limpiaDialogoAlta();
        dialogoAltaMarca.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAlActionPerformed

    private void btnCancelarAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAcActionPerformed

        limpiaDialogoAlta();
        dialogoActualizarMarca.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarAcActionPerformed

    private void btnGuardarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAlActionPerformed

         String nombre=tfNombreAl.getText();
        String descripcion=taDescripcionAl.getText();
        MarcaPOJO pojo = new MarcaPOJO();
        pojo.setNombre_marca(nombre);
        pojo.setDescripcion_marca(descripcion);
        boolean x=MarcaJDBC.insertar(pojo);
        if (x==true) {
            JOptionPane.showMessageDialog(null, "ÉXITO");
            cargarTabla();
            //Limpiar los campos
            limpiaDialogoAlta();
            //Apagar el dialogo
            dialogoAltaMarca.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarAlActionPerformed

    private void btnGuardarAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAcActionPerformed

      String id=tfIdAc.getText();
        String nombre=tfNombreAc.getText();
        String descripcion=taDescripcionAc.getText();
        MarcaPOJO pojo = new MarcaPOJO();
        pojo.setIdMarca(Integer.parseInt(id));
        pojo.setNombre_marca(nombre);
        pojo.setDescripcion_marca(descripcion);
        boolean x=MarcaJDBC.actualizar(pojo);
        if (x==true) {
            JOptionPane.showMessageDialog(null, "Éxito al actualizar");
            cargarTabla();
            //Hay que hacer limpia dialogo 2 y llamarlo aqui
            dialogoActualizarMarca.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }

       


        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarAcActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnCancelarAc;
    private javax.swing.JButton btnCancelarAl;
    private javax.swing.JButton btnGuardarAc;
    private javax.swing.JButton btnGuardarAl;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JDialog dialogoActualizarMarca;
    private javax.swing.JDialog dialogoAltaMarca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbActualizar;
    private javax.swing.JLabel lbAlta;
    private javax.swing.JLabel lbCantidadDeMarcas;
    private javax.swing.JLabel lbDescripcionAc;
    private javax.swing.JLabel lbDescripcionAl;
    private javax.swing.JLabel lbIdAc;
    private javax.swing.JLabel lbNombreAc;
    private javax.swing.JLabel lbNombreAl;
    private javax.swing.JTextArea taDescripcionAc;
    private javax.swing.JTextArea taDescripcionAl;
    private javax.swing.JTable tbMarca;
    private javax.swing.JTextField tfIdAc;
    private javax.swing.JTextField tfNombreAc;
    private javax.swing.JTextField tfNombreAl;
    // End of variables declaration//GEN-END:variables
}
