package DB;

import Model.orders;
import Model.ordersDAO;
import UI.TablaSerigraphy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SerigraphyLaboratoryDAO implements ordersDAO {

    private Connection cn = conexion.getConexion();

    @Override
    public List<orders> Listarorders() {
        List<orders> lista = new ArrayList<>();

        try (PreparedStatement pstm = cn.prepareStatement("SELECT * FROM Productos WHERE done = 0");
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                int orders = rs.getInt(1);
                String product = rs.getString(2);
                int done = rs.getInt(3);

                orders order = new orders(orders, product, done);
                lista.add(order);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // O utiliza algún sistema de registro de errores
        }

        return lista;
    }

    @Override
    public void update(int _order, String _Product, int _newDone) {
        try {
            if (cn != null) { // Validar que la conexión no sea nula
                // Consulta preparada para evitar SQL injection
                String query = "UPDATE Productos SET done = ? WHERE codigo = ? AND nombre = ?";
                try (PreparedStatement pstm = cn.prepareStatement(query)) {
                    // Establecer los valores de los parámetros en la consulta preparada
                    pstm.setInt(1, _newDone);
                    pstm.setInt(2, _order);
                    pstm.setString(3, _Product);

                    // Ejecutar la actualización
                    pstm.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void borrar(int id) {
        try{
               Connection con = conexion.getConexion();
               PreparedStatement ps = con.prepareStatement("DELETE FROM Productos WHERE codigo=?");
               ps.setInt(1, id);
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Registro eliminado");
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.toString());
            }  
    }
    
    public static void editar(int Order, String Nombre, int Hechos) {
        try{
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE tabla SET nombre=?, encargado=?, orden=?");
            ps.setInt(1, Order);
            ps.setString(2, Nombre);
            ps.setInt(3, Hechos);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro modificado");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }    
    }
    
    public static void cargarDatos(DefaultTableModel modeloTabla){
        try {
            Connection con = conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("SELECT codigo, nombre, done FROM Productos");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();

            modeloTabla.setRowCount(0);

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void limpiarTabla() {
    try {
        if (cn != null) {
            String query = "DELETE FROM Productos WHERE done = 0";
            try (PreparedStatement pstm = cn.prepareStatement(query)) {
                pstm.executeUpdate();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public boolean existeOrdenExcepto(int order, int filaSeleccionada) {
    try {
        String query = "SELECT COUNT(*) FROM Productos WHERE codigo = ? AND id <> ?";
        try (PreparedStatement pstm = cn.prepareStatement(query)) {
            pstm.setInt(1, order);
            pstm.setInt(2, filaSeleccionada);

            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Manejo adecuado de excepciones
    }
    return false;
}

}
