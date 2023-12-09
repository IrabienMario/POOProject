
package Controler;
import DB.SerigraphyLaboratoryDAO;
import javax.swing.table.DefaultTableModel;
public class PuenteDBV {
    public static void puenteBorrar(int id){
        SerigraphyLaboratoryDAO.borrar(id);
    }
    
    public static void puenteActualizar(DefaultTableModel modeloTabla){
        SerigraphyLaboratoryDAO.cargarDatos(modeloTabla);
    }
    
    public static void puenteEditar(int Order, String Nombre, int Hechos){
        SerigraphyLaboratoryDAO.editar(Order, Nombre, Hechos);
    }
}


