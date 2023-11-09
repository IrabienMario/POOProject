
package UI;

import DB.conexion;
import Controler.SerigraphyLaboratoryDAO;
import java.util.List;
import Model.orders;

public class MVCDNProject {

    public static void main(String[] args) {
        Login loginWindow = new Login();
        loginWindow.setVisible(true);
        conexion.estableceConexion();
        SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
 
        
        //insert.Update(0,fecha, "PD001",null, null);
        
        List<orders> listaPedidos = dao.Listarorders();
        
        for (orders pedido : listaPedidos) {
            pedido.printOrder();
        }
    }
}
