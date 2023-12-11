
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    public static Connection getConexion() {
        return estableceConexion();
    }
    
    public static Connection estableceConexion(){
        Connection con;
        try{
            String url = "jdbc:h2:~/pooH2;DB_CLOSE_DELAY=-1";
            
            Class.forName("org.h2.Driver");

            con = DriverManager.getConnection(url, "sa", "12345678");
            JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
            return con;
        } catch(ClassNotFoundException | SQLException e){
            e.printStackTrace(); 
            return null;
        }
    }//cierra getConnection()

    private static void mostrarMensaje(String mensaje) {
        // Muestra un cuadro de diálogo con el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static void mostrarMensajeError(String mensaje, SQLException e) {
        // Muestra un cuadro de diálogo con el mensaje de error y detalles adicionales
        JOptionPane.showMessageDialog(null, mensaje + " " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}