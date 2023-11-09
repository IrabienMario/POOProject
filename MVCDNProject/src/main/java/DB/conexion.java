
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    private static Connection cn = null;

    static String Usuario = "CloudSA96c7d864";
    static String Contraseña = "DNproject_IrabienRosado";
    static String Bd = "SQL_DB_POOProject";
    static String ip = "dnproject.database.windows.net";
    static String Puerto = "1433";

    public static Connection getConexion() {
        return estableceConexion();
    }

    public static Connection estableceConexion() {
        String Cadena = "jdbc:sqlserver://" + ip + ":" + Puerto + ";" + "databaseName=" + Bd + ";integratedSecurity=false;" + "encrypt=false;trustServerCertificate=true";

        try {
            cn = DriverManager.getConnection(Cadena, Usuario, Contraseña);
            mostrarMensaje("CONEXION EXITOSA");
            return cn; // Devuelve la conexión establecida
        } catch (SQLException e) {
            mostrarMensajeError("Error al conectar la base de datos:", e);
            return null; // Devuelve null en caso de error
        }
    }

    private static void mostrarMensaje(String mensaje) {
        // Muestra un cuadro de diálogo con el mensaje
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static void mostrarMensajeError(String mensaje, SQLException e) {
        // Muestra un cuadro de diálogo con el mensaje de error y detalles adicionales
        JOptionPane.showMessageDialog(null, mensaje + " " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}