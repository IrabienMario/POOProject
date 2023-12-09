
package Controler;
import DB.SerigraphyLaboratoryDAO;
import javax.swing.table.DefaultTableModel;
public class PuenteDBV {
    public void puenteBorrar(int id){
        SerigraphyLaboratoryDAO.borrar(id);
    }
    
    public void puenteActualizar(DefaultTableModel modeloTabla){
        SerigraphyLaboratoryDAO.cargarDatos(modeloTabla);
    }
    
    public void puenteEditar(int Order, String Nombre, int Hechos){
        SerigraphyLaboratoryDAO.editar(Order, Nombre, Hechos);
    }

    public void puenteActualizar(int Order, String Nombre, int Hechos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


