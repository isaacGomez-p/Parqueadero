package jitems;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vehiculo.Cobrar_tabla;
import vehiculo.Genera_vehiculo;

/**
 *
 * @author ISAACELEAZAR
 */
public class J_cobrar extends javax.swing.JFrame {
    
    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
    Genera_vehiculo obj4 = new Genera_vehiculo();
    Cobrar_tabla row;
    Conexion bd = new Conexion("postgres","admin");    
    Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    String ubc;
    public int idVal=0;
    /**
     * Creates new form J_cobrar
     * @param con_
     * @param stmt_
     */
    public J_cobrar(){
        this.con=bd.con();
        this.stmt=bd.stamt();
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

        jLabel1 = new javax.swing.JLabel();
        Tplaca = new javax.swing.JTextField();
        Bsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la placa:");

        Bsearch.setText("Buscar");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(Bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Tplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Tplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(Bsearch)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void borraBD(){
        String pl = Tplaca.getText();
        String qry = "DELETE FROM vehiculo_ingreso WHERE placa = '"+pl+"';";
        try{
            stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this,"Datos borrados de la base de datos.","Correcto",JOptionPane.NO_OPTION);
        }catch(SQLDataException e){
            System.out.printf("Error al borrar");
        } catch (SQLException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertaBD_2(){
        String qry ="INSERT INTO vehiculo_salida (placa,ubicacion,hora_salida,fecha_salida)VALUES ('"+row.getPlaca()+"','"+this.ubc+"','"+obj4.get_hora()+"','"+row.getFecha_ac()+"')";
        try{
            stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this,"Datos ingresados en la base de datos.","Correcto",JOptionPane.NO_OPTION);
        }catch(SQLDataException e){
            System.out.printf("Error al grabar");
        } catch (SQLException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void obtieneLlave(){
        String qry = "SELECT max(idvalor) FROM cobrar;";
        try{
           rs=stmt.executeQuery(qry);
            
           JOptionPane.showMessageDialog(this,"Esto hay: "+rs.toString(),"ENCONTRADO ",JOptionPane.OK_OPTION);
        }catch(SQLDataException e){
            System.out.printf("Error al grabar");
        } catch (SQLException ex) {
            Logger.getLogger(J_cobrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                 idVal = rs.getInt("max");
                 
                 System.out.println("Ultimo id:"+this.idVal);
            }
        } catch (SQLException ex) {
            Logger.getLogger(J_cobrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertaBD(){
        this.obtieneLlave();
        int a = this.idVal;
         String qry ="INSERT INTO cobrar (placa,tiempo,valor,idvalor,fecha_cobro)VALUES ('"+row.getPlaca()+"','"+row.getTiempo()+"','"+row.getValor()+"','"+(this.idVal+1)+"','"+row.getFecha_ac()+"')";
        try{
            stmt.executeUpdate(qry);
            JOptionPane.showMessageDialog(this,"Datos ingresados en la base de datos.","Correcto",JOptionPane.NO_OPTION);
        }catch(SQLDataException e){
            System.out.printf("Error al grabar");
        } catch (SQLException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        // TODO add your handling code here:
        String pl = Tplaca.getText();
        String a = new String();
        Time hora_e = null, hora_a;
        LocalTime hora_a_a, hora_e_e;
        Date fecha = null;
        
        String qry= "SELECT * FROM vehiculo_ingreso WHERE placa ='"+pl+"';";
        try{
           rs=stmt.executeQuery(qry);
            
           JOptionPane.showMessageDialog(this,"Bien","Correcto",JOptionPane.OK_OPTION);
        }catch(SQLDataException e){
            System.out.printf("Error al grabar");
        } catch (SQLException ex) {
            Logger.getLogger(J_cobrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                 a= rs.getString("placa");
                 hora_e = rs.getTime("hora_ingreso");
                 System.out.println("hora_e"+hora_e);
                 ubc = rs.getString("ubicacion");
            }
        } catch (SQLException ex) {
            Logger.getLogger(J_cobrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this,"Tiene"+a+"\nUbicacion:"+ubc,"no se",JOptionPane.OK_OPTION);
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Son las: "+ahora.getHour()+":"+ahora.getMinute()+":"+ahora.getSecond());
        String actual = obj4.get_hora();
        System.out.println("PASA ACTUAL:"+actual);
        hora_a = Time.valueOf(actual);
        JOptionPane.showMessageDialog(this,"Son las: "+hora_a,"HORA",JOptionPane.OK_OPTION);
        hora_a_a = LocalTime.parse(actual);
        
        
        String lc = hora_e.toString();
        hora_e_e = LocalTime.parse(lc);
        
        System.out.println("Estuvo "+(hora_a_a.toSecondOfDay()-hora_e_e.toSecondOfDay())+"segundos");
        System.out.println("Le cuesta: "+(hora_a_a.toSecondOfDay()-hora_e_e.toSecondOfDay())*6);
        Integer valor, tiempo;
        tiempo = hora_a_a.toSecondOfDay()-hora_e_e.toSecondOfDay();
        valor = (hora_a_a.toSecondOfDay()-hora_e_e.toSecondOfDay())*100;
        String fe = obj4.get_fecha();
        try {
            fecha = (Date) formateador.parse(fe);
        } catch (ParseException ex) {
            Logger.getLogger(Jingreso_de_carros.class.getName()).log(Level.SEVERE, null, ex);
        }
        row = new Cobrar_tabla(a,tiempo,valor,fecha);        
        this.insertaBD();
        this.insertaBD_2();
        this.borraBD();
    }//GEN-LAST:event_BsearchActionPerformed

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
            java.util.logging.Logger.getLogger(J_cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(J_cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(J_cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(J_cobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsearch;
    private javax.swing.JTextField Tplaca;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
