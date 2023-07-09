package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mysql://localhost:3306/proyecto";
    private static final String usuario = "root";
    private static final String contraseña = "";
    
    public Connection getConnection(){
        try
        {
        return DriverManager.getConnection(url,usuario, contraseña);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"no se pudo conectar a la base de datos");
            return null;
        }
    }
}
