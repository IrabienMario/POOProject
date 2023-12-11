package DB;

import static DB.conexion.getConexion;
import UI.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResetTablas {

    public static void main(String[] args) {
        try (Connection connection = getConexion()) {
            // Elimina la tabla SerigraphyLaboratory
            eliminarTabla(connection, "SerigraphyLaboratory");

            // Elimina la tabla LaboratoryProduction
            eliminarTabla(connection, "LaboratoryProduction");

            // Elimina la tabla ZamakProduction
            eliminarTabla(connection, "ZamakProduction");

            // Elimina la tabla CarpinteryProduction
            eliminarTabla(connection, "CarpinteryProduction");

            // Elimina la tabla SewingProduction
            eliminarTabla(connection, "SewingProduction");

            // Elimina la tabla DesignProduction
            eliminarTabla(connection, "DesignProduction");

            // Elimina la tabla HandicraftProduction
            eliminarTabla(connection, "HandicraftProduction");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Obtén la conexión a la base de datos (ajusta la URL, usuario y contraseña)
        try (Connection connection = getConexion()) {
            // Crea la tabla para SerigraphyLaboratory
            crearTabla(connection, "SerigraphyLaboratory", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255), codigo INT, done INT");

            // Crea la tabla para LaboratoryProduction
            crearTabla(connection, "LaboratoryProduction", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255), codigo INT, done INT");

            // Crea la tabla para ZamakProduction
            crearTabla(connection, "ZamakProduction", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255),  codigo INT, done INT");

            // Crea la tabla para CarpinteryProduction
            crearTabla(connection, "CarpinteryProduction", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255),  codigo INT, done INT");

            // Crea la tabla para SewingProduction
            crearTabla(connection, "SewingProduction", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255),  codigo INT, done INT");

            // Crea la tabla para DesignProduction
            crearTabla(connection, "DesignProduction", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255),  codigo INT, done INT");

            // Crea la tabla para HandicraftProduction
            crearTabla(connection, "HandicraftProduction", "id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(255),  codigo INT, done INT");

            Login login = new Login();
            login.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void eliminarTabla(Connection con, String nombreTabla) {
        // Eliminamos la tabla
        String sql = "DROP TABLE IF EXISTS " + nombreTabla;

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Ejecuta la sentencia SQL
            stmt.executeUpdate();
            System.out.println("Tabla " + nombreTabla + " eliminada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void crearTabla(Connection con, String nombreTabla, String columnas) {
        // Creamos la tabla
        String sql = "CREATE TABLE IF NOT EXISTS " + nombreTabla + " (" + columnas + ")";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Ejecuta la sentencia SQL
            stmt.executeUpdate();
            System.out.println("Tabla " + nombreTabla + " creada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
