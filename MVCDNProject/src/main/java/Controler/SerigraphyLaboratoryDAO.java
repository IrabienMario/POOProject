package Controler;

import DB.conexion;
import Model.orders;
import Model.ordersDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SerigraphyLaboratoryDAO implements ordersDAO {

    private Connection cn = conexion.getConexion();

    @Override
    public List<orders> Listarorders() {
        List<orders> lista = new ArrayList<>();

        try (PreparedStatement pstm = cn.prepareStatement("SELECT * FROM [SQL_DB_POOProject].[dbo].[SerigraphyLaboratory] WHERE DONE = 0");
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
                String query = "UPDATE [dbo].[SerigraphyLaboratory] SET [Done] = ? WHERE [Order] = ? AND [Product] = ?";
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
    
    public void limpiarTabla() {
    try {
        if (cn != null) {
            String query = "DELETE FROM [dbo].[SerigraphyLaboratory] WHERE DONE = 0";
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
        String query = "SELECT COUNT(*) FROM [dbo].[SerigraphyLaboratory] WHERE [Order] = ? AND [ID] <> ?";
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
