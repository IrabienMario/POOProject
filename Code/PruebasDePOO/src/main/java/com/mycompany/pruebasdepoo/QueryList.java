/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasdepoo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Mario
 */
public class QueryList {
    public List<String> ListaDeInstertsLAB = new ArrayList<>(Arrays.asList(
        "INSERT INTO [dbo].[HandicraftsLab] ([Order],[Product] ,[Done]) VALUES(?,?,?)",
        "INSERT INTO [dbo].[SewingLab] ([Order],[Product] ,[Done]) VALUES(?,?,?)",
        "INSERT INTO [dbo].[SerigraphyLab] ([Order],[Product] ,[Done]) VALUES(?,?,?)",
        "INSERT INTO [dbo].[ZamakLab] ([Order],[Product] ,[Done]) VALUES(?,?,?)",
        "INSERT INTO [dbo].[DesignLab] ([Order],[Product] ,[Done]) VALUES(?,?,?)",
        "INSERT INTO [dbo].[Laboratory] ([Order],[Product] ,[Done]) VALUES(?,?,?)",
        "INSERT INTO [dbo].[CarpentryLab] ([Order],[Product] ,[Done]) VALUES(?,'?',?)"
    ));
}
