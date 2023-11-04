/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasdepoo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mario
 */
public class InsertTablesDN extends QueryList {
     Connection cn = conexion.estableceConexion();
     int Pkey;
     int Order;
     Date dateCharge;
     String product;
     int TotalQunatity;
     String adObv;
     String prodObsr;
     
        public void InsertNewOrder(int New,Date dateCharge, String product,int TotalQuantity,String adObv, String prodObsr){
                 this.dateCharge = dateCharge;
                 this.product = product;
                 this.TotalQunatity = TotalQuantity;
                 this.adObv = adObv;
                 this.prodObsr = prodObsr;
                 
                 
            try{            
                String query = "SELECT [Pkey],[Order] FROM [SQL_DB_POOProject].[dbo].[Orders]";
                PreparedStatement pstm = cn.prepareStatement(query);
                ResultSet rs = pstm.executeQuery();

                while(rs.next()){
                    this.Pkey = rs.getInt(1)+1;
                    this.Order = rs.getInt(2)+1;
                }
                
                if(New==0){
                    this.Order -= 1;
                }        
            }catch(Exception e){
                System.err.println(e);
            }
        }
        
        public void InsertInTable(){
                try{
                    String query = "INSERT INTO [dbo].[Orders] ([Pkey], [Order], [DateOfCharge], [Product], [TotalQuantity], [AdministratorObservations], [ProducerObservations], [QuantityDone])VALUES (?,?,?,?,?,?,?,?)";
                    PreparedStatement pstm = cn.prepareStatement(query);

                    pstm.setInt(1,this.Pkey);
                    pstm.setInt(2,this.Order);
                    pstm.setDate(3, new java.sql.Date(this.dateCharge.getTime()));
                    pstm.setString(4, this.product);
                    pstm.setInt(5, this.TotalQunatity);
                    pstm.setString(6, this.adObv);
                    pstm.setString(7, this.prodObsr);
                    pstm.setInt(8, 0);

                    pstm.executeUpdate();
                }catch(Exception e){
                    System.err.println(e);
                }

            }

        public void InsertInLabs(){
                List<Integer> lista;
                try{
                    String query = "SELECT [HandicraftsLab] ,[SewingLab],[SerigraphyLab],[ZamakLab],[DesignLab],[Laboratory],[CarpentryLab] FROM [SQL_DB_POOProject].[dbo].[ProductDescription] WHERE [ProductID] = '"+product+"'";
                    PreparedStatement pstm = cn.prepareStatement(query);
                    ResultSet rs = pstm.executeQuery();
                    lista = new ArrayList<>();

                    lista.add(rs.getInt(1));
                    lista.add(rs.getInt(2));
                    lista.add(rs.getInt(3));
                    lista.add(rs.getInt(4));
                    lista.add(rs.getInt(5));
                    lista.add(rs.getInt(6));
                    lista.add(rs.getInt(7));

                    int act = 0;
                    for(int v : lista){
                        if(v==1){
                            String query2 = this.ListaDeInstertsLAB.get(act);
                            PreparedStatement pstm2 = cn.prepareStatement(query2);

                            pstm2.setInt(1,this.Order);
                            pstm2.setString(2, this.product);
                            pstm2.setInt(3, 0);

                            pstm2.executeUpdate();
                        }
                        act++;
                    }

                }catch(Exception e){
                    System.err.println(e);
                }

            }
    
    
}
