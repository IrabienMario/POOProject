/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasdepoo;

/**
 *
 * @author Mario
 */
public class orders {
    int Orders;
    String Product;
    int Done;
    
    public orders(int _Orders,String _Product, int _Done){
        this.Orders = _Orders;
        this.Product = _Product;
        this.Done = _Done;
    }
    
public void printOrder(){
    System.out.println("Orders: " + this.Orders + ", Product: " + this.Product + ", Done: " + this.Done);
}
    
 public int getOrders(){
        return Orders;
    }
    
    public void setOrders(int _Orders){
        this.Orders = _Orders;
    }
    
    public String getProduct(){
        return Product;
    }
    
    public void setProduct(String _Product){
        this.Product = _Product;
    }
    
    public int getDone(){
        return Done;
    }
    
    public void setDone(int _Done){
        this.Done = _Done;
    }
}
