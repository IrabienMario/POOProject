/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasdepoo;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Mario
 */
public class SerigraphyLaboratoryDAO implements ordersDAO{
   
    Connection cn = conexion.estableceConexion();
    
    @Override
    public List<orders> Listarorders(){
        List<orders> lista = new ArrayList<orders>();
        try{
            String query = "SELECT * FROM [SQL_DB_POOProject].[dbo].[SerigraphyLaboratory] WHERE DONE = 0";
            PreparedStatement pstm = cn.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                int orders = rs.getInt(1);
                String product = rs.getString(2);
                int done = rs.getInt(3);
                
                orders order = new orders(orders,product,done);
                lista.add(order);
            }
            pstm.close();
        }catch(Exception e){
            System.err.println(e);
        }
        return lista;
    }
    
    @Override
    public void update(int _order, String _Product, int _newDone) {
        try {
            // Consulta preparada para evitar SQL injection
            String query = "UPDATE [dbo].[SerigraphyLaboratory] SET [Done] = ? WHERE [Order] = ? AND [Product] = ?";
            PreparedStatement pstm = cn.prepareStatement(query);

            // Establecer los valores de los parámetros en la consulta preparada
            pstm.setInt(1, _newDone);
            pstm.setInt(2, _order);
            pstm.setString(3, _Product);

            // Ejecutar la actualización
            pstm.executeQuery();
            pstm.close();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
