/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jitems;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vehiculo.Ubicacion;
import vehiculo.Genera_vehiculo;

/**
 *
 * @author ISAACELEAZAR
 */
public class Jingreso_de_carros extends javax.swing.JFrame {
    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:mm:ss");
    
    Genera_vehiculo obj1= new Genera_vehiculo();
    Ubicacion obj2 = new Ubicacion();
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    
    String placa_bd, ubicacion_bd;
    Date fecha_ingreso_bd;
    LocalTime hora_ingreso_bd;
    
    
    //Jpiso_dos Opisodos = new Jpiso_dos();
    //Jpiso_tres Opisotres = new Jpiso_tres();
    
    /**
     * Creates new form Jprincipal
     */
    public Jingreso_de_carros(Connection con_, Statement stmt_) {
        initComponents();
        this.con = con_;
        this.stmt = stmt_;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        nuevo_carro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPlaca = new javax.swing.JTextPane();
        jSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMoto = new javax.swing.JButton();
        choice1 = new java.awt.Choice();
        Ver_piso1 = new javax.swing.JButton();
        Ver_piso2 = new javax.swing.JButton();
        Ver_piso3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        totalCarros = new javax.swing.JMenuItem();
        totalMotos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        tVehiculos1 = new javax.swing.JMenuItem();
        cMoto1 = new javax.swing.JMenuItem();
        cCarro1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        tVehiculos2 = new javax.swing.JMenuItem();
        cMoto2 = new javax.swing.JMenuItem();
        cCarro2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        tVehiculos3 = new javax.swing.JMenuItem();
        cMoto3 = new javax.swing.JMenuItem();
        cCarro3 = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nuevo_carro.setText("Ingresar");
        nuevo_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_carroActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar un carro");

        jScrollPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jScrollPane1FocusLost(evt);
            }
        });

        jPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPlacaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jPlaca);

        jSalir.setForeground(new java.awt.Color(255, 0, 0));
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingresar una moto");

        jMoto.setText("Ingresar");
        jMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMotoActionPerformed(evt);
            }
        });

        Ver_piso1.setText("Piso 1");
        Ver_piso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_piso1ActionPerformed(evt);
            }
        });

        Ver_piso2.setText("Piso 2");
        Ver_piso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_piso2ActionPerformed(evt);
            }
        });

        Ver_piso3.setText("Piso 3");
        Ver_piso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver_piso3ActionPerformed(evt);
            }
        });

        jMenu3.setText("Cantidad de Vehiculos");

        totalCarros.setText("Total Carros");
        totalCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCarrosActionPerformed(evt);
            }
        });
        jMenu3.add(totalCarros);

        totalMotos.setText("Total Motos");
        totalMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMotosActionPerformed(evt);
            }
        });
        jMenu3.add(totalMotos);

        jMenu2.setText("Piso 1");

        tVehiculos1.setText("Vehiculos Total");
        tVehiculos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tVehiculos1ActionPerformed(evt);
            }
        });
        jMenu2.add(tVehiculos1);

        cMoto1.setText("Cantidad Motos");
        cMoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMoto1ActionPerformed(evt);
            }
        });
        jMenu2.add(cMoto1);

        cCarro1.setText("Cantidad Carros");
        cCarro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCarro1ActionPerformed(evt);
            }
        });
        jMenu2.add(cCarro1);

        jMenu3.add(jMenu2);

        jMenu4.setText("Piso 2");

        tVehiculos2.setText("Total Vehiculos");
        tVehiculos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tVehiculos2ActionPerformed(evt);
            }
        });
        jMenu4.add(tVehiculos2);

        cMoto2.setText("Cantidad Motos");
        cMoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMoto2ActionPerformed(evt);
            }
        });
        jMenu4.add(cMoto2);

        cCarro2.setText("Cantidad Carros");
        cCarro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCarro2ActionPerformed(evt);
            }
        });
        jMenu4.add(cCarro2);

        jMenu3.add(jMenu4);

        jMenu5.setText("Piso 3");

        tVehiculos3.setText("Total Vehiculos");
        tVehiculos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tVehiculos3ActionPerformed(evt);
            }
        });
        jMenu5.add(tVehiculos3);

        cMoto3.setText("Cantidad Motos");
        cMoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMoto3ActionPerformed(evt);
            }
        });
        jMenu5.add(cMoto3);

        cCarro3.setText("Cantidad Carros");
        cCarro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCarro3ActionPerformed(evt);
            }
        });
        jMenu5.add(cCarro3);

        jMenu3.add(jMenu5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Ver_piso1)
                        .addGap(57, 57, 57)
                        .addComponent(Ver_piso2)
                        .addGap(69, 69, 69)
                        .addComponent(Ver_piso3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nuevo_carro))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jMoto))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSalir)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nuevo_carro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jMoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ver_piso1)
                    .addComponent(Ver_piso2)
                    .addComponent(Ver_piso3))
                .addGap(34, 34, 34)
                .addComponent(jSalir)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevo_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_carroActionPerformed
        // TODO add your handling code here:
        System.out.println("Placa nueva");
        obj1.genera_placa();
        obj1.genera_hora();
        String fecha = obj1.get_fecha();
        String hora = obj1.get_hora();
        JOptionPane.showMessageDialog(this, "Fecha: "+ fecha + " Hora: "+hora,"VEHICULO INGRESADO", JOptionPane.OK_OPTION);
        
        String placa = new String();
        placa = obj1.pasa_placa();
        jPlaca.setText(placa+"\nCarro");
        obj2.genera_lugar(1);
        String posicion;
        posicion = obj2.get_posicion();
        
        jPlaca.setText(placa+"\nCarro"+"\nlugar: "+posicion);
        
        this.placa_bd=placa;
        this.ubicacion_bd = posicion;
            
        try {
            this.fecha_ingreso_bd = (Date) formateador.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.hora_ingreso_bd = LocalTime.parse(hora);
       System.out.println("hora"+hora_ingreso_bd);
       this.ingresaBD();
            
    }//GEN-LAST:event_nuevo_carroActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMotoActionPerformed
        // TODO add your handling code here:
        System.out.println("\n\nPlaca nueva");
        obj1.genera_placa_moto();
        obj1.genera_hora();
        String fecha = obj1.get_fecha();
        String hora = obj1.get_hora();
        JOptionPane.showMessageDialog(this, "Fecha: "+ fecha + " Hora: "+hora,"VEHICULO INGRESADO", JOptionPane.OK_OPTION);
        String placa;
        placa = obj1.pasa_placa();
        jPlaca.setText(placa+"\nMoto");
        obj2.genera_lugar(2);
        String posicion;
        posicion = obj2.get_posicion();
        
        
        jPlaca.setText(placa+"\nMoto"+"\nlugar: "+posicion);
        
        this.placa_bd=placa;
        this.ubicacion_bd = posicion;
            
        try {
            this.fecha_ingreso_bd = (Date) formateador.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.hora_ingreso_bd = LocalTime.parse(hora);
       System.out.println("hora"+hora_ingreso_bd);
       this.ingresaBD();
        
        
    }//GEN-LAST:event_jMotoActionPerformed

    private void jScrollPane1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jScrollPane1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1FocusLost

    public void ingresaBD(){
        String qry ="INSERT INTO vehiculo_ingreso (placa,ubicacion,fecha_ingreso,hora_ingreso)VALUES ('"+this.placa_bd+"','"+this.ubicacion_bd+"','"+this.fecha_ingreso_bd+"','"+this.hora_ingreso_bd+"')";
        try{
            stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this,"Datos ingresados en la base de datos.","Correcto",JOptionPane.NO_OPTION);
        }catch(SQLDataException e){
            System.out.printf("Error al grabar");
        } catch (SQLException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jPlacaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPlacaKeyPressed
        // TODO add your handling code here:
        jPlaca.setEnabled(false);
    }//GEN-LAST:event_jPlacaKeyPressed

    private void totalMotosActionPerformed(java.awt.event.ActionEvent evt) {                                           

    

        // TODO add your handling code here:
        int n;
        n = obj1.cantidad_motos();
        JOptionPane.showMessageDialog(this, "Hay "+ n + " moto(s) en este momento.","", JOptionPane.PLAIN_MESSAGE);
    }                                          

    private void cCarro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCarro1ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_cCant1();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_cCarro1ActionPerformed

    private void Ver_piso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_piso1ActionPerformed
        // TODO add your handling code here:
        Jpiso_uno Opisouno;
        try {
            Opisouno = new Jpiso_uno(stmt,con);
            Opisouno.setVisible(true);
            Opisouno.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Ver_piso1ActionPerformed

    private void Ver_piso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_piso2ActionPerformed
        // TODO add your handling code here:
        //Opisodos.setVisible(true);
        //Opisodos.setLocationRelativeTo(null);
    }//GEN-LAST:event_Ver_piso2ActionPerformed

    private void Ver_piso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver_piso3ActionPerformed
        // TODO add your handling code here:
        //Opisotres.setVisible(true);
        //Opisotres.setLocationRelativeTo(null);
    }//GEN-LAST:event_Ver_piso3ActionPerformed

    private void totalCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCarrosActionPerformed
        // TODO add your handling code here:
        int n;
        n = obj1.cantidad_carros();
        JOptionPane.showMessageDialog(this, "Hay "+ n + " carro(s) en este momento.","", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_totalCarrosActionPerformed

    private void tVehiculos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tVehiculos1ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_cant1();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tVehiculos1ActionPerformed

    private void tVehiculos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tVehiculos2ActionPerformed
        // TODO add your handling code here:
        int c2;
        c2 = obj2.get_cant2();
        JOptionPane.showMessageDialog(this, "Hay "+ c2 + " vehiculos en este momento.","PISO 2", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tVehiculos2ActionPerformed

    private void tVehiculos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tVehiculos3ActionPerformed
        // TODO add your handling code here:
        int c3;
        c3 = obj2.get_cant3();
        JOptionPane.showMessageDialog(this, "Hay "+ c3 + " vehiculos en este momento.","PISO 3", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tVehiculos3ActionPerformed

    private void cCarro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCarro2ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_cCant2();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cCarro2ActionPerformed

    private void cCarro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCarro3ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_cCant3();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cCarro3ActionPerformed

    private void cMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMoto1ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_mCant1();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cMoto1ActionPerformed

    private void cMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMoto2ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_mCant2();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cMoto2ActionPerformed

    private void cMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMoto3ActionPerformed
        // TODO add your handling code here:
        int c1;
        c1 = obj2.get_mCant3();
        JOptionPane.showMessageDialog(this, "Hay "+ c1 + " vehiculos en este momento.","PISO 1", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cMoto3ActionPerformed

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
            java.util.logging.Logger.getLogger(Jingreso_de_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jingreso_de_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jingreso_de_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jingreso_de_carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ver_piso1;
    private javax.swing.JButton Ver_piso2;
    private javax.swing.JButton Ver_piso3;
    private javax.swing.JMenuItem cCarro1;
    private javax.swing.JMenuItem cCarro2;
    private javax.swing.JMenuItem cCarro3;
    private javax.swing.JMenuItem cMoto1;
    private javax.swing.JMenuItem cMoto2;
    private javax.swing.JMenuItem cMoto3;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jMoto;
    private javax.swing.JTextPane jPlaca;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevo_carro;
    private javax.swing.JMenuItem tVehiculos1;
    private javax.swing.JMenuItem tVehiculos2;
    private javax.swing.JMenuItem tVehiculos3;
    private javax.swing.JMenuItem totalCarros;
    private javax.swing.JMenuItem totalMotos;
    // End of variables declaration//GEN-END:variables

    
}
