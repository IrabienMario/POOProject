/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UI;

import DB.conexion;
import Controler.SerigraphyLaboratoryDAO;
import java.util.List;
import Model.orders;


/**
 *
 * @author Mario
 */
public class MVCDNProject {

    public static void main(String[] args) {
                
        conexion.estableceConexion();
        SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
 
        
        //insert.Update(0,fecha, "PD001",null, null);
        
        List<orders> listaPedidos = dao.Listarorders();
        
        for (orders pedido : listaPedidos) {
            pedido.printOrder();
        }
    }
}
