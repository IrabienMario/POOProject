
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {

    private static Connection cn = null;

    static String Usuario = "sa";
    static String Contraseña = "12345678";
    static String Bd = "proyectoPOO";
    static String Puerto = "1433";

    public static Connection getConexion() {
        return estableceConexion();
    }

    public static Connection estableceConexion() {
        String Cadena = "jdbc:sqlserver://localhost:" + Puerto + ";" + "databaseName=" + Bd + ";integratedSecurity=false;" + "encrypt=false;trustServerCertificate=true";

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