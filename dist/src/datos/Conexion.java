package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mysql://byhqc2mltvzcd1s1ripl-mysql.services.clever-cloud.com:3306/byhqc2mltvzcd1s1ripl";
    private static final String usuario = "usawjol1ntvnjpr0";
    private static final String contraseña = "pedd1Vg7FurYGtTnODwr";
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(url, usuario, contraseña);
        }catch(Exception e){
                        System.out.println(e);
            JOptionPane.showMessageDialog(null,"no se pudo conectar a la base de datos");
            return null;

        }
    }
}
