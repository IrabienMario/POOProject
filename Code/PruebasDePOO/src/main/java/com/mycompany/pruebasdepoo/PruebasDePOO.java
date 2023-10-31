
package com.mycompany.pruebasdepoo;

import java.util.List;


public class PruebasDePOO {
    public static void main(String[] args) {
        
        SerigraphyLaboratoryDAO dao = new SerigraphyLaboratoryDAO();
        
        dao.update(4,"PD001",0);
        
        // Obtener la lista de pedidos
        List<orders> listaPedidos = dao.Listarorders();
        
        // Imprimir los pedidos
        for (orders pedido : listaPedidos) {
            System.out.println("Pedido: " + pedido.Orders);
            System.out.println("Producto: " + pedido.Product);
            System.out.println("Done: " + pedido.Done);
            System.out.println("----------------");
        }
    }
}
