/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jitems;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ISAACELEAZAR
 */
public class Jacceso extends javax.swing.JFrame {

    /**
     * Creates new form Jacceso
     */
     Connection con = null;
    Statement stmt = null;
    public Jacceso() {
        initComponents();
        TFnombre.setText("postgres");
        TFpass.setText("admin");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jnombre = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        jPassw = new javax.swing.JLabel();
        TFpass = new javax.swing.JPasswordField();
        Blogin = new javax.swing.JButton();
        Blimpiar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        jLabel1.setText("ADMIN");

        jnombre.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jnombre.setText("Nombre :");

        jPassw.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jPassw.setText("Contraseña: ");

        Blogin.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Blogin.setText("Iniciar Sesión");
        Blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloginActionPerformed(evt);
            }
        });

        Blimpiar.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Bsalir.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        Bsalir.setForeground(new java.awt.Color(255, 0, 0));
        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPassw)
                    .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(TFpass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Blogin)
                .addGap(18, 18, 18)
                .addComponent(Blimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Bsalir)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassw)
                    .addComponent(TFpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Blogin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Blimpiar)
                        .addComponent(Bsalir)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        // TODO add your handling code here:
        TFnombre.setText("");
        TFpass.setText("");
        
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void BloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloginActionPerformed
        // TODO add your handling code here:
        String EMPTY = "";
        char a = 0;
        String pa = new String(TFpass.getPassword());
        String nom = TFnombre.getText();
        if(nom.equals(EMPTY) || pa.equals(EMPTY)){
            JOptionPane.showMessageDialog(this,"Dígite todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String user = TFnombre.getText();
            String contra = new String(TFpass.getPassword());
            Conexion obc= new Conexion(user,contra);
            if (obc.indica_1() == 1 && obc.indica_2() == 1 ){
                con = obc.con();
                stmt = obc.stamt();
                
                Jingreso_de_carros obj1 = new Jingreso_de_carros(con,stmt);
                obj1.setVisible(true);
                obj1.setLocationRelativeTo(null);
            }
            else
                JOptionPane.showMessageDialog(this,"No se pudo conectar/clave o usuario invalidos ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BloginActionPerformed

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
            java.util.logging.Logger.getLogger(Jacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jacceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jacceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blimpiar;
    private javax.swing.JButton Blogin;
    private javax.swing.JButton Bsalir;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JPasswordField TFpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jPassw;
    private javax.swing.JLabel jnombre;
    // End of variables declaration//GEN-END:variables
}
