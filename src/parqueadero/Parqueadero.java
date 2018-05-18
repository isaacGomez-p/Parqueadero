/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import jitems.J_cobrar;
import jitems.Jingreso_de_carros;
import jitems.Jinicio;

/**
 *
 * @author ISAACELEAZAR
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jinicio obj1 = new Jinicio();
        
       
        obj1.setVisible(true);
        obj1.setLocationRelativeTo(null);
    
        
        
    }
    
    
}
