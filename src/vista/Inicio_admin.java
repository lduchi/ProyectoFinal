/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import java.awt.Color;
public class Inicio_admin extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Inicio_admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblInicioSesion = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        FONDO = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        BtnIngresar = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JPanel();
        botonsalir = new javax.swing.JPanel();
        txtsalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicioSesion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblInicioSesion.setText("INICIO DE SESION");
        jPanel1.add(lblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, 40));

        lblUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, -1));

        lblContra.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblContra.setText("Contraseña");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 214, -1));

        txtContrasenia.setForeground(new java.awt.Color(204, 204, 204));
        txtContrasenia.setText("Ingrese su contraseña");
        txtContrasenia.setBorder(null);
        txtContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseniaMouseClicked(evt);
            }
        });
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 214, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4c8d4cd565d316ded7174c3d7c70f7d6.jpg"))); // NOI18N
        jPanel1.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 330, 460));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 20));

        BtnIngresar.setBackground(new java.awt.Color(172, 13, 17));
        BtnIngresar.setPreferredSize(new java.awt.Dimension(83, 31));
        BtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnIngresarMouseExited(evt);
            }
        });

        txtingresar.setBackground(new java.awt.Color(172, 13, 17));
        txtingresar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 255, 255));
        txtingresar.setText("  INGRESAR");
        txtingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtingresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnIngresarLayout = new javax.swing.GroupLayout(BtnIngresar);
        BtnIngresar.setLayout(BtnIngresarLayout);
        BtnIngresarLayout.setHorizontalGroup(
            BtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtnIngresarLayout.setVerticalGroup(
            BtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 110, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        botonsalir.setBackground(new java.awt.Color(255, 255, 255));
        botonsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonsalirMouseExited(evt);
            }
        });

        txtsalir.setBackground(new java.awt.Color(255, 255, 255));
        txtsalir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtsalir.setText(" X");
        txtsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtsalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonsalirLayout = new javax.swing.GroupLayout(botonsalir);
        botonsalir.setLayout(botonsalirLayout);
        botonsalirLayout.setHorizontalGroup(
            botonsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonsalirLayout.createSequentialGroup()
                .addComponent(txtsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonsalirLayout.setVerticalGroup(
            botonsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 617, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseClicked

        String usuario = "notita";
        String contra = "m2b";

        String pass = new String(txtContrasenia.getPassword());
        if (txtUsuario.getText().equals(usuario) && pass.equals(contra)) {
            txtUsuario.setText("");
            txtContrasenia.setText("");

            PanelAdmin paneladmin = new PanelAdmin();
            paneladmin.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario/Contraseña incorrecta");
            limpiarlabel();
        }
    
    }//GEN-LAST:event_BtnIngresarMouseClicked

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
       txtUsuario.setText("");
       txtUsuario.setForeground(Color.black);
       
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseniaMouseClicked
      txtContrasenia.setText("");
      txtUsuario.setForeground(Color.black);
    }//GEN-LAST:event_txtContraseniaMouseClicked

    private void txtsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtsalirMouseClicked

    private void txtsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalirMouseEntered
    botonsalir.setBackground(Color.red);
    }//GEN-LAST:event_txtsalirMouseEntered

    private void botonsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsalirMouseEntered
       
    }//GEN-LAST:event_botonsalirMouseEntered

    private void botonsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsalirMouseExited
       
    }//GEN-LAST:event_botonsalirMouseExited

    private void BtnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseEntered
       
    }//GEN-LAST:event_BtnIngresarMouseEntered

    private void txtingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseExited
      txtingresar.setBackground(new Color(172,13,17));
    }//GEN-LAST:event_txtingresarMouseExited

    private void BtnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresarMouseExited
       
    }//GEN-LAST:event_BtnIngresarMouseExited

    private void txtsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsalirMouseExited
        botonsalir.setBackground(Color.white);
    }//GEN-LAST:event_txtsalirMouseExited

    private void txtingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseClicked
        
        String usuario = "notita";
        String contra = "m2b";

        String pass = new String(txtContrasenia.getPassword());
        if (txtUsuario.getText().equals(usuario) && pass.equals(contra)) {
            txtUsuario.setText("");
            txtContrasenia.setText("");
            this.dispose();
            PanelAdmin paneladmin = new PanelAdmin();
            paneladmin.setVisible(true);
            

        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario/Contraseña incorrecta");
            limpiarlabel();            
        }
       
    }//GEN-LAST:event_txtingresarMouseClicked

    private void txtingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseEntered
      txtingresar.setBackground(new Color(231,84,87));
    }//GEN-LAST:event_txtingresarMouseEntered

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
            java.util.logging.Logger.getLogger(Inicio_admin

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_admin

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_admin

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_admin

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_admin().setVisible(true);
            }
        });
    }

    public void limpiarlabel() {
        txtUsuario.setText("");
        txtContrasenia.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnIngresar;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JLabel FONDO;
    private javax.swing.JPanel botonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel txtingresar;
    private javax.swing.JLabel txtsalir;
    // End of variables declaration//GEN-END:variables
}
