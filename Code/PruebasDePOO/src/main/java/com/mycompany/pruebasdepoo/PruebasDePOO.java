
package com.mycompany.pruebasdepoo;

import java.util.List;
import java.util.Date;


public class PruebasDePOO {
    public static void main(String[] args) {
        
        SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
        InsertTablesDN insert = new InsertTablesDN();
        
        Date fecha = new Date(104, 2, 10); 
        
        insert.InsertNewOrder(0,fecha,"PD002",15,null,null);
        insert.InsertInTable();
        insert.InsertInLabs();
        
        List<orders> listaPedidos = dao.Listarorders();
        
        for (orders pedido : listaPedidos) {
            pedido.printOrder();
        }
    }
}
