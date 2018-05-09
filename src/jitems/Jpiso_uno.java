/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jitems;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Jpiso_uno extends javax.swing.JFrame {

    ResultSet rs = null;
    String qry;
    Statement stmt=null;
    Connection con=null;
    /**
     * Creates new form Jpiso_uno
     */
    public Jpiso_uno(Statement stmt, Connection con) throws SQLException {
        initComponents();
        this.stmt=stmt;
        this.con=con;
        
        qry = "Select * FROM vehiculo_ingreso";
        try{
            rs = stmt.executeQuery(qry);
            rs.first();
            for(int i=0;i<=150;i++){
                switch(rs.getString(2)){
                    case "A1":
                        La1.setForeground(Color.RED);
                    break;
                    case "A2":
                        La2.setForeground(Color.RED);
                    break;
                    case "A3":
                        La3.setForeground(Color.RED);
                    break;
                    case "A4":
                        La4.setForeground(Color.RED);
                    break;
                    case "A5":
                        La5.setForeground(Color.RED);
                    break;
                    case "A6":
                        La6.setForeground(Color.RED);
                    break;
                    case "A7":
                        La7.setForeground(Color.RED);
                    break;
                    case "A8":
                        La8.setForeground(Color.RED);
                    break;
                    case "A9":
                        La9.setForeground(Color.RED);
                    break;
                    case "A10":
                        La10.setForeground(Color.RED);
                    break;
                    case "A11":
                        La11.setForeground(Color.RED);
                    break;
                    case "A12":
                        La12.setForeground(Color.RED);
                    break;
                    case "A13":
                        La13.setForeground(Color.RED);
                    break;
                    case "A14":
                        La14.setForeground(Color.RED);
                    break;
                    case "A15":
                        La15.setForeground(Color.RED);
                    break;
                    case "A16":
                        La16.setForeground(Color.RED);
                    break;
                    case "A17":
                        La17.setForeground(Color.RED);
                    break;
                    case "A18":
                        La18.setForeground(Color.RED);
                    break;
                    case "A19":
                        La19.setForeground(Color.RED);
                    break;
                    case "A20":
                        La20.setForeground(Color.RED);
                    break;
                    case "A21":
                        La21.setForeground(Color.RED);
                    break;
                    case "A22":
                        La22.setForeground(Color.RED);
                    break;
                    case "A23":
                        La23.setForeground(Color.RED);
                    break;
                    case "A24":
                        La24.setForeground(Color.RED);
                    break;
                    case "A25":
                        La25.setForeground(Color.RED);
                    break;
                    case "A26":
                        La26.setForeground(Color.RED);
                    break;
                    case "A27":
                        La27.setForeground(Color.RED);
                    break;
                    case "A28":
                        La28.setForeground(Color.RED);
                    break;
                    case "A29":
                        La29.setForeground(Color.RED);
                    break;
                    case "A30":
                        La30.setForeground(Color.RED);
                    break;
                    case "A31":
                        La31.setForeground(Color.RED);
                    break;
                    case "A32":
                        La32.setForeground(Color.RED);
                    break;
                    case "A33":
                        La33.setForeground(Color.RED);
                    break;
                    case "A34":
                        La34.setForeground(Color.RED);
                    break;
                    case "A35":
                        La35.setForeground(Color.RED);
                    break;
                    case "A36":
                        La36.setForeground(Color.RED);
                    break;
                    case "A37":
                        La37.setForeground(Color.RED);
                    break;
                    case "A38":
                        La38.setForeground(Color.RED);
                    break;
                    case "A39":
                        La39.setForeground(Color.RED);
                    break;
                    case "A40":
                        La40.setForeground(Color.RED);
                    break;
                    case "A41":
                        La41.setForeground(Color.RED);
                    break;
                    case "A42":
                        La42.setForeground(Color.RED);
                    break;
                    case "A43":
                        La43.setForeground(Color.RED);
                    break;
                    case "A44":
                        La44.setForeground(Color.RED);
                    break;
                    case "A45":
                        La45.setForeground(Color.RED);
                    break;
                    case "A46":
                        La46.setForeground(Color.RED);
                    break;
                    case "A47":
                        La47.setForeground(Color.RED);
                    break;
                    case "A48":
                        La48.setForeground(Color.RED);
                    break;
                    case "A49":
                        La49.setForeground(Color.RED);
                    break;
                    case "A50":
                        La50.setForeground(Color.RED);
                    break;
                    
                    case "B1":
                        Lb1.setForeground(Color.RED);
                    break;
                    case "B2":
                        Lb2.setForeground(Color.RED);
                    break;
                    case "B3":
                        Lb3.setForeground(Color.RED);
                    break;
                    case "B4":
                        Lb4.setForeground(Color.RED);
                    break;
                    case "B5":
                        Lb5.setForeground(Color.RED);
                    break;
                    case "B6":
                        Lb6.setForeground(Color.RED);
                    break;
                    case "B7":
                        Lb7.setForeground(Color.RED);
                    break;
                    case "B8":
                        Lb8.setForeground(Color.RED);
                    break;
                    case "B9":
                        Lb9.setForeground(Color.RED);
                    break;
                    case "B10":
                        Lb10.setForeground(Color.RED);
                    break;
                    case "B11":
                        Lb11.setForeground(Color.RED);
                    break;
                    case "B12":
                        Lb12.setForeground(Color.RED);
                    break;
                    case "B13":
                        Lb13.setForeground(Color.RED);
                    break;
                    case "B14":
                        Lb14.setForeground(Color.RED);
                    break;
                    case "B15":
                        Lb15.setForeground(Color.RED);
                    break;
                    case "B16":
                        Lb16.setForeground(Color.RED);
                    break;
                    case "B17":
                        Lb17.setForeground(Color.RED);
                    break;
                    case "B18":
                        Lb18.setForeground(Color.RED);
                    break;
                    case "B19":
                        Lb19.setForeground(Color.RED);
                    break;
                    case "B20":
                        Lb20.setForeground(Color.RED);
                    break;
                    case "B21":
                        Lb21.setForeground(Color.RED);
                    break;
                    case "B22":
                        Lb22.setForeground(Color.RED);
                    break;
                    case "B23":
                        Lb23.setForeground(Color.RED);
                    break;
                    case "B24":
                        Lb24.setForeground(Color.RED);
                    break;
                    case "B25":
                        Lb25.setForeground(Color.RED);
                    break;
                    case "B26":
                        Lb26.setForeground(Color.RED);
                    break;
                    case "B27":
                        Lb27.setForeground(Color.RED);
                    break;
                    case "B28":
                        Lb28.setForeground(Color.RED);
                    break;
                    case "B29":
                        Lb29.setForeground(Color.RED);
                    break;
                    case "B30":
                        Lb30.setForeground(Color.RED);
                    break;
                    case "B31":
                        Lb31.setForeground(Color.RED);
                    break;
                    case "B32":
                        Lb32.setForeground(Color.RED);
                    break;
                    case "B33":
                        Lb33.setForeground(Color.RED);
                    break;
                    case "B34":
                        Lb34.setForeground(Color.RED);
                    break;
                    case "B35":
                        Lb35.setForeground(Color.RED);
                    break;
                    case "B36":
                        Lb36.setForeground(Color.RED);
                    break;
                    case "B37":
                        Lb37.setForeground(Color.RED);
                    break;
                    case "B38":
                        Lb38.setForeground(Color.RED);
                    break;
                    case "B39":
                        Lb39.setForeground(Color.RED);
                    break;
                    case "B40":
                        Lb40.setForeground(Color.RED);
                    break;
                    case "B41":
                        Lb41.setForeground(Color.RED);
                    break;
                    case "B42":
                        Lb42.setForeground(Color.RED);
                    break;
                    case "B43":
                        Lb43.setForeground(Color.RED);
                    break;
                    case "B44":
                        Lb44.setForeground(Color.RED);
                    break;
                    case "B45":
                        Lb45.setForeground(Color.RED);
                    break;
                    case "B46":
                        Lb46.setForeground(Color.RED);
                    break;
                    case "B47":
                        Lb47.setForeground(Color.RED);
                    break;
                    case "B48":
                        Lb48.setForeground(Color.RED);
                    break;
                    case "B49":
                        Lb49.setForeground(Color.RED);
                    break;
                    case "B50":
                        Lb50.setForeground(Color.RED);
                    break;
                    
                    case "C1":
                        Lc1.setForeground(Color.RED);
                    break;
                    case "C2":
                        Lc2.setForeground(Color.RED);
                    break;
                    case "C3":
                        Lc3.setForeground(Color.RED);
                    break;
                    case "C4":
                        Lc4.setForeground(Color.RED);
                    break;
                    case "C5":
                        Lc5.setForeground(Color.RED);
                    break;
                    case "C6":
                        Lc6.setForeground(Color.RED);
                    break;
                    case "C7":
                        Lc7.setForeground(Color.RED);
                    break;
                    case "C8":
                        Lc8.setForeground(Color.RED);
                    break;
                    case "C9":
                        Lc9.setForeground(Color.RED);
                    break;
                    case "C10":
                        Lc10.setForeground(Color.RED);
                    break;
                    case "C11":
                        Lc11.setForeground(Color.RED);
                    break;
                    case "C12":
                        Lc12.setForeground(Color.RED);
                    break;
                    case "C13":
                        Lc13.setForeground(Color.RED);
                    break;
                    case "C14":
                        Lc14.setForeground(Color.RED);
                    break;
                    case "C15":
                        Lc15.setForeground(Color.RED);
                    break;
                    case "C16":
                        Lc16.setForeground(Color.RED);
                    break;
                    case "C17":
                        Lc17.setForeground(Color.RED);
                    break;
                    case "C18":
                        Lc18.setForeground(Color.RED);
                    break;
                    case "C19":
                        Lc19.setForeground(Color.RED);
                    break;
                    case "C20":
                        Lc20.setForeground(Color.RED);
                    break;
                    case "C21":
                        Lc21.setForeground(Color.RED);
                    break;
                    case "C22":
                        Lc22.setForeground(Color.RED);
                    break;
                    case "C23":
                        Lc23.setForeground(Color.RED);
                    break;
                    case "C24":
                        Lc24.setForeground(Color.RED);
                    break;
                    case "C25":
                        Lc25.setForeground(Color.RED);
                    break;
                    case "C26":
                        Lc26.setForeground(Color.RED);
                    break;
                    case "C27":
                        Lc27.setForeground(Color.RED);
                    break;
                    case "C28":
                        Lc28.setForeground(Color.RED);
                    break;
                    case "C29":
                        Lc29.setForeground(Color.RED);
                    break;
                    case "C30":
                        Lc30.setForeground(Color.RED);
                    break;
                    case "C31":
                        Lc31.setForeground(Color.RED);
                    break;
                    case "C32":
                        Lc32.setForeground(Color.RED);
                    break;
                    case "C33":
                        Lc33.setForeground(Color.RED);
                    break;
                    case "C34":
                        Lc34.setForeground(Color.RED);
                    break;
                    case "C35":
                        Lc35.setForeground(Color.RED);
                    break;
                    case "C36":
                        Lc36.setForeground(Color.RED);
                    break;
                    case "C37":
                        Lc37.setForeground(Color.RED);
                    break;
                    case "C38":
                        Lc38.setForeground(Color.RED);
                    break;
                    case "C39":
                        Lc39.setForeground(Color.RED);
                    break;
                    case "C40":
                        Lc40.setForeground(Color.RED);
                    break;
                    case "C41":
                        Lc41.setForeground(Color.RED);
                    break;
                    case "C42":
                        Lc42.setForeground(Color.RED);
                    break;
                    case "C43":
                        Lc43.setForeground(Color.RED);
                    break;
                    case "C44":
                        Lc44.setForeground(Color.RED);
                    break;
                    case "C45":
                        Lc45.setForeground(Color.RED);
                    break;
                    case "C46":
                        Lc46.setForeground(Color.RED);
                    break;
                    case "C47":
                        Lc47.setForeground(Color.RED);
                    break;
                    case "C48":
                        Lc48.setForeground(Color.RED);
                    break;
                    case "C49":
                        Lc49.setForeground(Color.RED);
                    break;
                    case "C50":
                        Lc50.setForeground(Color.RED);
                    break;
                }
                rs.next();
            }
        }catch(SQLException e){
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        La1 = new javax.swing.JLabel();
        La2 = new javax.swing.JLabel();
        La3 = new javax.swing.JLabel();
        La4 = new javax.swing.JLabel();
        La5 = new javax.swing.JLabel();
        La6 = new javax.swing.JLabel();
        La7 = new javax.swing.JLabel();
        La8 = new javax.swing.JLabel();
        La9 = new javax.swing.JLabel();
        La10 = new javax.swing.JLabel();
        Lpiso1 = new javax.swing.JLabel();
        La11 = new javax.swing.JLabel();
        La12 = new javax.swing.JLabel();
        La13 = new javax.swing.JLabel();
        La14 = new javax.swing.JLabel();
        La15 = new javax.swing.JLabel();
        La16 = new javax.swing.JLabel();
        La17 = new javax.swing.JLabel();
        La18 = new javax.swing.JLabel();
        La19 = new javax.swing.JLabel();
        La20 = new javax.swing.JLabel();
        La21 = new javax.swing.JLabel();
        La22 = new javax.swing.JLabel();
        La23 = new javax.swing.JLabel();
        La24 = new javax.swing.JLabel();
        La25 = new javax.swing.JLabel();
        La26 = new javax.swing.JLabel();
        La27 = new javax.swing.JLabel();
        La28 = new javax.swing.JLabel();
        La29 = new javax.swing.JLabel();
        La30 = new javax.swing.JLabel();
        La31 = new javax.swing.JLabel();
        La32 = new javax.swing.JLabel();
        La33 = new javax.swing.JLabel();
        La34 = new javax.swing.JLabel();
        La35 = new javax.swing.JLabel();
        La36 = new javax.swing.JLabel();
        La37 = new javax.swing.JLabel();
        La38 = new javax.swing.JLabel();
        La39 = new javax.swing.JLabel();
        La40 = new javax.swing.JLabel();
        La41 = new javax.swing.JLabel();
        La42 = new javax.swing.JLabel();
        La43 = new javax.swing.JLabel();
        La44 = new javax.swing.JLabel();
        La45 = new javax.swing.JLabel();
        La46 = new javax.swing.JLabel();
        La47 = new javax.swing.JLabel();
        La48 = new javax.swing.JLabel();
        La49 = new javax.swing.JLabel();
        La50 = new javax.swing.JLabel();
        Bsalir = new javax.swing.JButton();
        Lpiso2 = new javax.swing.JLabel();
        Lb43 = new javax.swing.JLabel();
        Lb44 = new javax.swing.JLabel();
        Lb45 = new javax.swing.JLabel();
        Lb46 = new javax.swing.JLabel();
        Lb47 = new javax.swing.JLabel();
        Lb48 = new javax.swing.JLabel();
        Lb49 = new javax.swing.JLabel();
        Lb50 = new javax.swing.JLabel();
        Lb9 = new javax.swing.JLabel();
        Lb10 = new javax.swing.JLabel();
        Lb11 = new javax.swing.JLabel();
        Lb12 = new javax.swing.JLabel();
        Lb13 = new javax.swing.JLabel();
        Lb14 = new javax.swing.JLabel();
        Lb15 = new javax.swing.JLabel();
        Lb16 = new javax.swing.JLabel();
        Lb17 = new javax.swing.JLabel();
        Lb18 = new javax.swing.JLabel();
        Lb1 = new javax.swing.JLabel();
        Lb2 = new javax.swing.JLabel();
        Lb3 = new javax.swing.JLabel();
        Lb4 = new javax.swing.JLabel();
        Lb5 = new javax.swing.JLabel();
        Lb6 = new javax.swing.JLabel();
        Lb7 = new javax.swing.JLabel();
        Lb8 = new javax.swing.JLabel();
        Lb19 = new javax.swing.JLabel();
        Lb20 = new javax.swing.JLabel();
        Lb21 = new javax.swing.JLabel();
        Lb22 = new javax.swing.JLabel();
        Lb23 = new javax.swing.JLabel();
        Lb24 = new javax.swing.JLabel();
        Lb25 = new javax.swing.JLabel();
        Lb26 = new javax.swing.JLabel();
        Lb27 = new javax.swing.JLabel();
        Lb28 = new javax.swing.JLabel();
        Lb29 = new javax.swing.JLabel();
        Lb30 = new javax.swing.JLabel();
        Lb31 = new javax.swing.JLabel();
        Lb32 = new javax.swing.JLabel();
        Lb33 = new javax.swing.JLabel();
        Lb34 = new javax.swing.JLabel();
        Lb35 = new javax.swing.JLabel();
        Lb36 = new javax.swing.JLabel();
        Lb37 = new javax.swing.JLabel();
        Lb38 = new javax.swing.JLabel();
        Lb39 = new javax.swing.JLabel();
        Lb40 = new javax.swing.JLabel();
        Lb41 = new javax.swing.JLabel();
        Lb42 = new javax.swing.JLabel();
        Lpiso3 = new javax.swing.JLabel();
        Lc31 = new javax.swing.JLabel();
        Lc32 = new javax.swing.JLabel();
        Lc33 = new javax.swing.JLabel();
        Lc34 = new javax.swing.JLabel();
        Lc35 = new javax.swing.JLabel();
        Lc36 = new javax.swing.JLabel();
        Lc37 = new javax.swing.JLabel();
        Lc38 = new javax.swing.JLabel();
        Lc39 = new javax.swing.JLabel();
        Lc40 = new javax.swing.JLabel();
        Lc1 = new javax.swing.JLabel();
        Lc2 = new javax.swing.JLabel();
        Lc3 = new javax.swing.JLabel();
        Lc4 = new javax.swing.JLabel();
        Lc5 = new javax.swing.JLabel();
        Lc6 = new javax.swing.JLabel();
        Lc7 = new javax.swing.JLabel();
        Lc8 = new javax.swing.JLabel();
        Lc41 = new javax.swing.JLabel();
        Lc9 = new javax.swing.JLabel();
        Lc42 = new javax.swing.JLabel();
        Lc10 = new javax.swing.JLabel();
        Lc43 = new javax.swing.JLabel();
        Lc44 = new javax.swing.JLabel();
        Lc45 = new javax.swing.JLabel();
        Lc46 = new javax.swing.JLabel();
        Lc47 = new javax.swing.JLabel();
        Lc48 = new javax.swing.JLabel();
        Lc49 = new javax.swing.JLabel();
        Lc50 = new javax.swing.JLabel();
        Lc11 = new javax.swing.JLabel();
        Lc12 = new javax.swing.JLabel();
        Lc13 = new javax.swing.JLabel();
        Lc14 = new javax.swing.JLabel();
        Lc15 = new javax.swing.JLabel();
        Lc16 = new javax.swing.JLabel();
        Lc17 = new javax.swing.JLabel();
        Lc18 = new javax.swing.JLabel();
        Lc19 = new javax.swing.JLabel();
        Lc20 = new javax.swing.JLabel();
        Lc21 = new javax.swing.JLabel();
        Lc22 = new javax.swing.JLabel();
        Lc23 = new javax.swing.JLabel();
        Lc24 = new javax.swing.JLabel();
        Lc25 = new javax.swing.JLabel();
        Lc26 = new javax.swing.JLabel();
        Lc27 = new javax.swing.JLabel();
        Lc28 = new javax.swing.JLabel();
        Lc29 = new javax.swing.JLabel();
        Lc30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        La1.setForeground(new java.awt.Color(0, 102, 0));
        La1.setText("A1");

        La2.setForeground(new java.awt.Color(0, 102, 0));
        La2.setText("A2");

        La3.setForeground(new java.awt.Color(0, 102, 0));
        La3.setText("A3");

        La4.setForeground(new java.awt.Color(0, 102, 0));
        La4.setText("A4");

        La5.setForeground(new java.awt.Color(0, 102, 0));
        La5.setText("A5");

        La6.setForeground(new java.awt.Color(0, 102, 0));
        La6.setText("A6");

        La7.setForeground(new java.awt.Color(0, 102, 0));
        La7.setText("A7");

        La8.setForeground(new java.awt.Color(0, 102, 0));
        La8.setText("A8");

        La9.setForeground(new java.awt.Color(0, 102, 0));
        La9.setText("A9");

        La10.setForeground(new java.awt.Color(0, 102, 0));
        La10.setText("A10");

        Lpiso1.setText("PISO 1");

        La11.setForeground(new java.awt.Color(0, 102, 0));
        La11.setText("A11");

        La12.setForeground(new java.awt.Color(0, 102, 0));
        La12.setText("A12");

        La13.setForeground(new java.awt.Color(0, 102, 0));
        La13.setText("A13");

        La14.setForeground(new java.awt.Color(0, 102, 0));
        La14.setText("A14");

        La15.setForeground(new java.awt.Color(0, 102, 0));
        La15.setText("A15");

        La16.setForeground(new java.awt.Color(0, 102, 0));
        La16.setText("A16");

        La17.setForeground(new java.awt.Color(0, 102, 0));
        La17.setText("A17");

        La18.setForeground(new java.awt.Color(0, 102, 0));
        La18.setText("A18");

        La19.setForeground(new java.awt.Color(0, 102, 0));
        La19.setText("A19");

        La20.setForeground(new java.awt.Color(0, 102, 0));
        La20.setText("A20");

        La21.setForeground(new java.awt.Color(0, 102, 0));
        La21.setText("A21");

        La22.setForeground(new java.awt.Color(0, 102, 0));
        La22.setText("A22");

        La23.setForeground(new java.awt.Color(0, 102, 0));
        La23.setText("A23");

        La24.setForeground(new java.awt.Color(0, 102, 0));
        La24.setText("A24");

        La25.setForeground(new java.awt.Color(0, 102, 0));
        La25.setText("A25");

        La26.setForeground(new java.awt.Color(0, 102, 0));
        La26.setText("A26");

        La27.setForeground(new java.awt.Color(0, 102, 0));
        La27.setText("A27");

        La28.setForeground(new java.awt.Color(0, 102, 0));
        La28.setText("A28");

        La29.setForeground(new java.awt.Color(0, 102, 0));
        La29.setText("A29");

        La30.setForeground(new java.awt.Color(0, 102, 0));
        La30.setText("A30");

        La31.setForeground(new java.awt.Color(0, 102, 0));
        La31.setText("A31");

        La32.setForeground(new java.awt.Color(0, 102, 0));
        La32.setText("A32");

        La33.setForeground(new java.awt.Color(0, 102, 0));
        La33.setText("A33");

        La34.setForeground(new java.awt.Color(0, 102, 0));
        La34.setText("A34");

        La35.setForeground(new java.awt.Color(0, 102, 0));
        La35.setText("A35");

        La36.setForeground(new java.awt.Color(0, 102, 0));
        La36.setText("A36");

        La37.setForeground(new java.awt.Color(0, 102, 0));
        La37.setText("A37");

        La38.setForeground(new java.awt.Color(0, 102, 0));
        La38.setText("A38");

        La39.setForeground(new java.awt.Color(0, 102, 0));
        La39.setText("A39");

        La40.setForeground(new java.awt.Color(0, 102, 0));
        La40.setText("A40");

        La41.setForeground(new java.awt.Color(0, 102, 0));
        La41.setText("A41");

        La42.setForeground(new java.awt.Color(0, 102, 0));
        La42.setText("A42");

        La43.setForeground(new java.awt.Color(0, 102, 0));
        La43.setText("A43");

        La44.setForeground(new java.awt.Color(0, 102, 0));
        La44.setText("A44");

        La45.setForeground(new java.awt.Color(0, 102, 0));
        La45.setText("A45");

        La46.setForeground(new java.awt.Color(0, 102, 0));
        La46.setText("A46");

        La47.setForeground(new java.awt.Color(0, 102, 0));
        La47.setText("A47");

        La48.setForeground(new java.awt.Color(0, 102, 0));
        La48.setText("A48");

        La49.setForeground(new java.awt.Color(0, 102, 0));
        La49.setText("A49");

        La50.setForeground(new java.awt.Color(0, 102, 0));
        La50.setText("A50");

        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        Lpiso2.setText("PISO 2");

        Lb43.setForeground(new java.awt.Color(0, 102, 0));
        Lb43.setText("B43");

        Lb44.setForeground(new java.awt.Color(0, 102, 0));
        Lb44.setText("B44");

        Lb45.setForeground(new java.awt.Color(0, 102, 0));
        Lb45.setText("B45");

        Lb46.setForeground(new java.awt.Color(0, 102, 0));
        Lb46.setText("B46");

        Lb47.setForeground(new java.awt.Color(0, 102, 0));
        Lb47.setText("B47");

        Lb48.setForeground(new java.awt.Color(0, 102, 0));
        Lb48.setText("B48");

        Lb49.setForeground(new java.awt.Color(0, 102, 0));
        Lb49.setText("B49");

        Lb50.setForeground(new java.awt.Color(0, 102, 0));
        Lb50.setText("B50");

        Lb9.setForeground(new java.awt.Color(0, 102, 0));
        Lb9.setText("B9");

        Lb10.setForeground(new java.awt.Color(0, 102, 0));
        Lb10.setText("B10");

        Lb11.setForeground(new java.awt.Color(0, 102, 0));
        Lb11.setText("B11");

        Lb12.setForeground(new java.awt.Color(0, 102, 0));
        Lb12.setText("B12");

        Lb13.setForeground(new java.awt.Color(0, 102, 0));
        Lb13.setText("B13");

        Lb14.setForeground(new java.awt.Color(0, 102, 0));
        Lb14.setText("B14");

        Lb15.setForeground(new java.awt.Color(0, 102, 0));
        Lb15.setText("B15");

        Lb16.setForeground(new java.awt.Color(0, 102, 0));
        Lb16.setText("B16");

        Lb17.setForeground(new java.awt.Color(0, 102, 0));
        Lb17.setText("B17");

        Lb18.setForeground(new java.awt.Color(0, 102, 0));
        Lb18.setText("B18");

        Lb1.setForeground(new java.awt.Color(0, 102, 0));
        Lb1.setText("B1");

        Lb2.setForeground(new java.awt.Color(0, 102, 0));
        Lb2.setText("B2");

        Lb3.setForeground(new java.awt.Color(0, 102, 0));
        Lb3.setText("B3");

        Lb4.setForeground(new java.awt.Color(0, 102, 0));
        Lb4.setText("B4");

        Lb5.setForeground(new java.awt.Color(0, 102, 0));
        Lb5.setText("B5");

        Lb6.setForeground(new java.awt.Color(0, 102, 0));
        Lb6.setText("B6");

        Lb7.setForeground(new java.awt.Color(0, 102, 0));
        Lb7.setText("B7");

        Lb8.setForeground(new java.awt.Color(0, 102, 0));
        Lb8.setText("B8");

        Lb19.setForeground(new java.awt.Color(0, 102, 0));
        Lb19.setText("B19");

        Lb20.setForeground(new java.awt.Color(0, 102, 0));
        Lb20.setText("B20");

        Lb21.setForeground(new java.awt.Color(0, 102, 0));
        Lb21.setText("B21");

        Lb22.setForeground(new java.awt.Color(0, 102, 0));
        Lb22.setText("B22");

        Lb23.setForeground(new java.awt.Color(0, 102, 0));
        Lb23.setText("B23");

        Lb24.setForeground(new java.awt.Color(0, 102, 0));
        Lb24.setText("B24");

        Lb25.setForeground(new java.awt.Color(0, 102, 0));
        Lb25.setText("B25");

        Lb26.setForeground(new java.awt.Color(0, 102, 0));
        Lb26.setText("B26");

        Lb27.setForeground(new java.awt.Color(0, 102, 0));
        Lb27.setText("B27");

        Lb28.setForeground(new java.awt.Color(0, 102, 0));
        Lb28.setText("B28");

        Lb29.setForeground(new java.awt.Color(0, 102, 0));
        Lb29.setText("B29");

        Lb30.setForeground(new java.awt.Color(0, 102, 0));
        Lb30.setText("B30");

        Lb31.setForeground(new java.awt.Color(0, 102, 0));
        Lb31.setText("B31");

        Lb32.setForeground(new java.awt.Color(0, 102, 0));
        Lb32.setText("B32");

        Lb33.setForeground(new java.awt.Color(0, 102, 0));
        Lb33.setText("B33");

        Lb34.setForeground(new java.awt.Color(0, 102, 0));
        Lb34.setText("B34");

        Lb35.setForeground(new java.awt.Color(0, 102, 0));
        Lb35.setText("B35");

        Lb36.setForeground(new java.awt.Color(0, 102, 0));
        Lb36.setText("B36");

        Lb37.setForeground(new java.awt.Color(0, 102, 0));
        Lb37.setText("B37");

        Lb38.setForeground(new java.awt.Color(0, 102, 0));
        Lb38.setText("B38");

        Lb39.setForeground(new java.awt.Color(0, 102, 0));
        Lb39.setText("B39");

        Lb40.setForeground(new java.awt.Color(0, 102, 0));
        Lb40.setText("B40");

        Lb41.setForeground(new java.awt.Color(0, 102, 0));
        Lb41.setText("B41");

        Lb42.setForeground(new java.awt.Color(0, 102, 0));
        Lb42.setText("B42");

        Lpiso3.setText("PISO 3");

        Lc31.setForeground(new java.awt.Color(0, 102, 0));
        Lc31.setText("C31");

        Lc32.setForeground(new java.awt.Color(0, 102, 0));
        Lc32.setText("C32");

        Lc33.setForeground(new java.awt.Color(0, 102, 0));
        Lc33.setText("C33");

        Lc34.setForeground(new java.awt.Color(0, 102, 0));
        Lc34.setText("C34");

        Lc35.setForeground(new java.awt.Color(0, 102, 0));
        Lc35.setText("C35");

        Lc36.setForeground(new java.awt.Color(0, 102, 0));
        Lc36.setText("C36");

        Lc37.setForeground(new java.awt.Color(0, 102, 0));
        Lc37.setText("C37");

        Lc38.setForeground(new java.awt.Color(0, 102, 0));
        Lc38.setText("C38");

        Lc39.setForeground(new java.awt.Color(0, 102, 0));
        Lc39.setText("C39");

        Lc40.setForeground(new java.awt.Color(0, 102, 0));
        Lc40.setText("C40");

        Lc1.setForeground(new java.awt.Color(0, 102, 0));
        Lc1.setText("C1");

        Lc2.setForeground(new java.awt.Color(0, 102, 0));
        Lc2.setText("C2");

        Lc3.setForeground(new java.awt.Color(0, 102, 0));
        Lc3.setText("C3");

        Lc4.setForeground(new java.awt.Color(0, 102, 0));
        Lc4.setText("C4");

        Lc5.setForeground(new java.awt.Color(0, 102, 0));
        Lc5.setText("C5");

        Lc6.setForeground(new java.awt.Color(0, 102, 0));
        Lc6.setText("C6");

        Lc7.setForeground(new java.awt.Color(0, 102, 0));
        Lc7.setText("C7");

        Lc8.setForeground(new java.awt.Color(0, 102, 0));
        Lc8.setText("C8");

        Lc41.setForeground(new java.awt.Color(0, 102, 0));
        Lc41.setText("C41");

        Lc9.setForeground(new java.awt.Color(0, 102, 0));
        Lc9.setText("C9");

        Lc42.setForeground(new java.awt.Color(0, 102, 0));
        Lc42.setText("C42");

        Lc10.setForeground(new java.awt.Color(0, 102, 0));
        Lc10.setText("C10");

        Lc43.setForeground(new java.awt.Color(0, 102, 0));
        Lc43.setText("C43");

        Lc44.setForeground(new java.awt.Color(0, 102, 0));
        Lc44.setText("C44");

        Lc45.setForeground(new java.awt.Color(0, 102, 0));
        Lc45.setText("C45");

        Lc46.setForeground(new java.awt.Color(0, 102, 0));
        Lc46.setText("C46");

        Lc47.setForeground(new java.awt.Color(0, 102, 0));
        Lc47.setText("C47");

        Lc48.setForeground(new java.awt.Color(0, 102, 0));
        Lc48.setText("C48");

        Lc49.setForeground(new java.awt.Color(0, 102, 0));
        Lc49.setText("C49");

        Lc50.setForeground(new java.awt.Color(0, 102, 0));
        Lc50.setText("C50");

        Lc11.setForeground(new java.awt.Color(0, 102, 0));
        Lc11.setText("C11");

        Lc12.setForeground(new java.awt.Color(0, 102, 0));
        Lc12.setText("C12");

        Lc13.setForeground(new java.awt.Color(0, 102, 0));
        Lc13.setText("C13");

        Lc14.setForeground(new java.awt.Color(0, 102, 0));
        Lc14.setText("C14");

        Lc15.setForeground(new java.awt.Color(0, 102, 0));
        Lc15.setText("C15");

        Lc16.setForeground(new java.awt.Color(0, 102, 0));
        Lc16.setText("C16");

        Lc17.setForeground(new java.awt.Color(0, 102, 0));
        Lc17.setText("C17");

        Lc18.setForeground(new java.awt.Color(0, 102, 0));
        Lc18.setText("C18");

        Lc19.setForeground(new java.awt.Color(0, 102, 0));
        Lc19.setText("C19");

        Lc20.setForeground(new java.awt.Color(0, 102, 0));
        Lc20.setText("C20");

        Lc21.setForeground(new java.awt.Color(0, 102, 0));
        Lc21.setText("C21");

        Lc22.setForeground(new java.awt.Color(0, 102, 0));
        Lc22.setText("C22");

        Lc23.setForeground(new java.awt.Color(0, 102, 0));
        Lc23.setText("C23");

        Lc24.setForeground(new java.awt.Color(0, 102, 0));
        Lc24.setText("C24");

        Lc25.setForeground(new java.awt.Color(0, 102, 0));
        Lc25.setText("C25");

        Lc26.setForeground(new java.awt.Color(0, 102, 0));
        Lc26.setText("C26");

        Lc27.setForeground(new java.awt.Color(0, 102, 0));
        Lc27.setText("C27");

        Lc28.setForeground(new java.awt.Color(0, 102, 0));
        Lc28.setText("C28");

        Lc29.setForeground(new java.awt.Color(0, 102, 0));
        Lc29.setText("C29");

        Lc30.setForeground(new java.awt.Color(0, 102, 0));
        Lc30.setText("C30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(Bsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(La1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lpiso1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(La5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(La6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(La7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(La8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(La9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(La10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(La11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(La20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(La21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(La30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(La31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(La40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lb20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lb21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Lb29, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lb30, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lc41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lb31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb35, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb36, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb37, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lc31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lc21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lc11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lc20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lb41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb44, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lpiso3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Lb45, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb46, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb47, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb48, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb49, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb50, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Lpiso2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(La41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(La49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(La50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Lpiso1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(La1)
                    .addComponent(La2)
                    .addComponent(La3)
                    .addComponent(La4)
                    .addComponent(La5)
                    .addComponent(La6)
                    .addComponent(La7)
                    .addComponent(La8)
                    .addComponent(La9)
                    .addComponent(La10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(La11)
                    .addComponent(La12)
                    .addComponent(La13)
                    .addComponent(La14)
                    .addComponent(La15)
                    .addComponent(La16)
                    .addComponent(La17)
                    .addComponent(La18)
                    .addComponent(La19)
                    .addComponent(La20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(La21)
                    .addComponent(La22)
                    .addComponent(La23)
                    .addComponent(La24)
                    .addComponent(La25)
                    .addComponent(La26)
                    .addComponent(La27)
                    .addComponent(La28)
                    .addComponent(La29)
                    .addComponent(La30))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(La31)
                    .addComponent(La32)
                    .addComponent(La33)
                    .addComponent(La34)
                    .addComponent(La35)
                    .addComponent(La36)
                    .addComponent(La37)
                    .addComponent(La38)
                    .addComponent(La39)
                    .addComponent(La40))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(La41)
                    .addComponent(La42)
                    .addComponent(La43)
                    .addComponent(La44)
                    .addComponent(La45)
                    .addComponent(La46)
                    .addComponent(La47)
                    .addComponent(La48)
                    .addComponent(La49)
                    .addComponent(La50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lpiso2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb1)
                    .addComponent(Lb2)
                    .addComponent(Lb3)
                    .addComponent(Lb4)
                    .addComponent(Lb5)
                    .addComponent(Lb6)
                    .addComponent(Lb7)
                    .addComponent(Lb8)
                    .addComponent(Lb9)
                    .addComponent(Lb10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb11)
                    .addComponent(Lb12)
                    .addComponent(Lb13)
                    .addComponent(Lb14)
                    .addComponent(Lb15)
                    .addComponent(Lb16)
                    .addComponent(Lb17)
                    .addComponent(Lb18)
                    .addComponent(Lb19)
                    .addComponent(Lb20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb21)
                    .addComponent(Lb22)
                    .addComponent(Lb23)
                    .addComponent(Lb24)
                    .addComponent(Lb26)
                    .addComponent(Lb27)
                    .addComponent(Lb25)
                    .addComponent(Lb28)
                    .addComponent(Lb29)
                    .addComponent(Lb30))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lb32)
                        .addComponent(Lb33)
                        .addComponent(Lb34)
                        .addComponent(Lb35)
                        .addComponent(Lb36)
                        .addComponent(Lb37)
                        .addComponent(Lb38)
                        .addComponent(Lb39)
                        .addComponent(Lb40)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lb50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lb41)
                        .addComponent(Lb42)
                        .addComponent(Lb43)
                        .addComponent(Lb44)
                        .addComponent(Lb45)
                        .addComponent(Lb46)
                        .addComponent(Lb47)
                        .addComponent(Lb48)
                        .addComponent(Lb49)))
                .addGap(18, 18, 18)
                .addComponent(Lpiso3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lc1)
                    .addComponent(Lc2)
                    .addComponent(Lc3)
                    .addComponent(Lc4)
                    .addComponent(Lc5)
                    .addComponent(Lc6)
                    .addComponent(Lc7)
                    .addComponent(Lc8)
                    .addComponent(Lc9)
                    .addComponent(Lc10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lc11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Lc12)
                        .addComponent(Lc13)
                        .addComponent(Lc14)
                        .addComponent(Lc15)
                        .addComponent(Lc16)
                        .addComponent(Lc17)
                        .addComponent(Lc18)
                        .addComponent(Lc19)
                        .addComponent(Lc20)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lc21)
                    .addComponent(Lc22)
                    .addComponent(Lc23)
                    .addComponent(Lc24)
                    .addComponent(Lc25)
                    .addComponent(Lc26)
                    .addComponent(Lc27)
                    .addComponent(Lc28)
                    .addComponent(Lc29)
                    .addComponent(Lc30))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lc31)
                    .addComponent(Lc32)
                    .addComponent(Lc33)
                    .addComponent(Lc34)
                    .addComponent(Lc35)
                    .addComponent(Lc36)
                    .addComponent(Lc37)
                    .addComponent(Lc38)
                    .addComponent(Lc39)
                    .addComponent(Lc40))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lc41)
                    .addComponent(Lc42)
                    .addComponent(Lc43)
                    .addComponent(Lc44)
                    .addComponent(Lc45)
                    .addComponent(Lc46)
                    .addComponent(Lc47)
                    .addComponent(Lc48)
                    .addComponent(Lc49)
                    .addComponent(Lc50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Bsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BsalirActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bsalir;
    private javax.swing.JLabel La1;
    private javax.swing.JLabel La10;
    private javax.swing.JLabel La11;
    private javax.swing.JLabel La12;
    private javax.swing.JLabel La13;
    private javax.swing.JLabel La14;
    private javax.swing.JLabel La15;
    private javax.swing.JLabel La16;
    private javax.swing.JLabel La17;
    private javax.swing.JLabel La18;
    private javax.swing.JLabel La19;
    private javax.swing.JLabel La2;
    private javax.swing.JLabel La20;
    private javax.swing.JLabel La21;
    private javax.swing.JLabel La22;
    private javax.swing.JLabel La23;
    private javax.swing.JLabel La24;
    private javax.swing.JLabel La25;
    private javax.swing.JLabel La26;
    private javax.swing.JLabel La27;
    private javax.swing.JLabel La28;
    private javax.swing.JLabel La29;
    private javax.swing.JLabel La3;
    private javax.swing.JLabel La30;
    private javax.swing.JLabel La31;
    private javax.swing.JLabel La32;
    private javax.swing.JLabel La33;
    private javax.swing.JLabel La34;
    private javax.swing.JLabel La35;
    private javax.swing.JLabel La36;
    private javax.swing.JLabel La37;
    private javax.swing.JLabel La38;
    private javax.swing.JLabel La39;
    private javax.swing.JLabel La4;
    private javax.swing.JLabel La40;
    private javax.swing.JLabel La41;
    private javax.swing.JLabel La42;
    private javax.swing.JLabel La43;
    private javax.swing.JLabel La44;
    private javax.swing.JLabel La45;
    private javax.swing.JLabel La46;
    private javax.swing.JLabel La47;
    private javax.swing.JLabel La48;
    private javax.swing.JLabel La49;
    private javax.swing.JLabel La5;
    private javax.swing.JLabel La50;
    private javax.swing.JLabel La6;
    private javax.swing.JLabel La7;
    private javax.swing.JLabel La8;
    private javax.swing.JLabel La9;
    private javax.swing.JLabel Lb1;
    private javax.swing.JLabel Lb10;
    private javax.swing.JLabel Lb11;
    private javax.swing.JLabel Lb12;
    private javax.swing.JLabel Lb13;
    private javax.swing.JLabel Lb14;
    private javax.swing.JLabel Lb15;
    private javax.swing.JLabel Lb16;
    private javax.swing.JLabel Lb17;
    private javax.swing.JLabel Lb18;
    private javax.swing.JLabel Lb19;
    private javax.swing.JLabel Lb2;
    private javax.swing.JLabel Lb20;
    private javax.swing.JLabel Lb21;
    private javax.swing.JLabel Lb22;
    private javax.swing.JLabel Lb23;
    private javax.swing.JLabel Lb24;
    private javax.swing.JLabel Lb25;
    private javax.swing.JLabel Lb26;
    private javax.swing.JLabel Lb27;
    private javax.swing.JLabel Lb28;
    private javax.swing.JLabel Lb29;
    private javax.swing.JLabel Lb3;
    private javax.swing.JLabel Lb30;
    private javax.swing.JLabel Lb31;
    private javax.swing.JLabel Lb32;
    private javax.swing.JLabel Lb33;
    private javax.swing.JLabel Lb34;
    private javax.swing.JLabel Lb35;
    private javax.swing.JLabel Lb36;
    private javax.swing.JLabel Lb37;
    private javax.swing.JLabel Lb38;
    private javax.swing.JLabel Lb39;
    private javax.swing.JLabel Lb4;
    private javax.swing.JLabel Lb40;
    private javax.swing.JLabel Lb41;
    private javax.swing.JLabel Lb42;
    private javax.swing.JLabel Lb43;
    private javax.swing.JLabel Lb44;
    private javax.swing.JLabel Lb45;
    private javax.swing.JLabel Lb46;
    private javax.swing.JLabel Lb47;
    private javax.swing.JLabel Lb48;
    private javax.swing.JLabel Lb49;
    private javax.swing.JLabel Lb5;
    private javax.swing.JLabel Lb50;
    private javax.swing.JLabel Lb6;
    private javax.swing.JLabel Lb7;
    private javax.swing.JLabel Lb8;
    private javax.swing.JLabel Lb9;
    private javax.swing.JLabel Lc1;
    private javax.swing.JLabel Lc10;
    private javax.swing.JLabel Lc11;
    private javax.swing.JLabel Lc12;
    private javax.swing.JLabel Lc13;
    private javax.swing.JLabel Lc14;
    private javax.swing.JLabel Lc15;
    private javax.swing.JLabel Lc16;
    private javax.swing.JLabel Lc17;
    private javax.swing.JLabel Lc18;
    private javax.swing.JLabel Lc19;
    private javax.swing.JLabel Lc2;
    private javax.swing.JLabel Lc20;
    private javax.swing.JLabel Lc21;
    private javax.swing.JLabel Lc22;
    private javax.swing.JLabel Lc23;
    private javax.swing.JLabel Lc24;
    private javax.swing.JLabel Lc25;
    private javax.swing.JLabel Lc26;
    private javax.swing.JLabel Lc27;
    private javax.swing.JLabel Lc28;
    private javax.swing.JLabel Lc29;
    private javax.swing.JLabel Lc3;
    private javax.swing.JLabel Lc30;
    private javax.swing.JLabel Lc31;
    private javax.swing.JLabel Lc32;
    private javax.swing.JLabel Lc33;
    private javax.swing.JLabel Lc34;
    private javax.swing.JLabel Lc35;
    private javax.swing.JLabel Lc36;
    private javax.swing.JLabel Lc37;
    private javax.swing.JLabel Lc38;
    private javax.swing.JLabel Lc39;
    private javax.swing.JLabel Lc4;
    private javax.swing.JLabel Lc40;
    private javax.swing.JLabel Lc41;
    private javax.swing.JLabel Lc42;
    private javax.swing.JLabel Lc43;
    private javax.swing.JLabel Lc44;
    private javax.swing.JLabel Lc45;
    private javax.swing.JLabel Lc46;
    private javax.swing.JLabel Lc47;
    private javax.swing.JLabel Lc48;
    private javax.swing.JLabel Lc49;
    private javax.swing.JLabel Lc5;
    private javax.swing.JLabel Lc50;
    private javax.swing.JLabel Lc6;
    private javax.swing.JLabel Lc7;
    private javax.swing.JLabel Lc8;
    private javax.swing.JLabel Lc9;
    private javax.swing.JLabel Lpiso1;
    private javax.swing.JLabel Lpiso2;
    private javax.swing.JLabel Lpiso3;
    // End of variables declaration//GEN-END:variables
}
