
package com.mycompany.pruebasdepoo;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class conexion {
    static Connection Conectar = null;
    
    static String Usuario = "usersql";
    static String Contraseña = "123";
    static String Bd = "SQL_DB_POOProject";
    static String ip ="localhost";
    static String Puerto ="1433";
    
    String Cadena= "jdbc:sqlserver://"+ip+":"+Puerto+"/"+Bd;
    
    public static Connection estableceConexion(){
        try {
            String Cadena = "jdbc:sqlserver://localhost:"+Puerto+";"+"databaseName="+Bd+";integratedSecurity=false;"+"encrypt=false;trustServerCertificate=true";
            Conectar = DriverManager.getConnection(Cadena,Usuario,Contraseña);
            JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
        } catch(Exception e){   
            JOptionPane .showMessageDialog(null,"Error al conectar la base de datos:" + e.toString());
        }
        return Conectar;
    }
}
    