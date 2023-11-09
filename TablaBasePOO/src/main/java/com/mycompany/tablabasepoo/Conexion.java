
package com.mycompany.tablabasepoo;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class Conexion {
    
    private static Connection cn = null;
    
    static String Usuario = "CloudSA96c7d864";
    static String Contraseña = "DNproject_IrabienRosado";
    static String Bd = "SQL_DB_POOProject";
    static String ip ="dnproject.database.windows.net";
    static String Puerto ="1433";

    public static Connection getConexion() {
    Connection cn = estableceConexion(); // Llama al método estableceConexion para obtener la conexión.
    return cn;
}

    
    String Cadena= "jdbc:sqlserver://"+ip+":"+Puerto+"/"+Bd;
    
    public static Connection estableceConexion(){
        try {
            String Cadena = "jdbc:sqlserver://"+ip+":"+Puerto+";"+"databaseName="+Bd+";integratedSecurity=false;"+"encrypt=false;trustServerCertificate=true";
            cn = DriverManager.getConnection(Cadena,Usuario,Contraseña);
            JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
        } catch(Exception e){   
            JOptionPane .showMessageDialog(null,"Error al conectar la base de datos:" + e.toString());
        }
        return cn;
    }
}