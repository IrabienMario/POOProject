package Conexiones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class CargarConfiguraciones {

    public static void main(String[] args) {
        // Crear un objeto Properties
        Properties propiedades = new Properties();

        // Cargar las propiedades desde el archivo
        try (InputStream input = new FileInputStream("configuraciones.properties")) {
            propiedades.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Obtener el número total de conexiones
        int numConexiones = Integer.parseInt(propiedades.getProperty("numConexiones", "0"));

        // Imprimir las conexiones disponibles
        for (int i = 1; i <= numConexiones; i++) {
            String ip = propiedades.getProperty("conexion" + i + ".ip");
            String usuario = propiedades.getProperty("conexion" + i + ".usuario");
            String contrasena = propiedades.getProperty("conexion" + i + ".contrasena");

            System.out.println("Conexión " + i + ":");
            System.out.println("IP: " + ip);
            System.out.println("Usuario: " + usuario);
            System.out.println("Contraseña: " + contrasena);
            System.out.println();
        }

        // Permitir que el usuario elija una conexión
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de la conexión que desea utilizar: ");
        int seleccion = scanner.nextInt();

        // Obtener valores de propiedades para la conexión seleccionada
        String ipSeleccionada = propiedades.getProperty("conexion" + seleccion + ".ip");
        String usuarioSeleccionado = propiedades.getProperty("conexion" + seleccion + ".usuario");
        String contrasenaSeleccionada = propiedades.getProperty("conexion" + seleccion + ".contrasena");

        // Imprimir los valores de la conexión seleccionada
        System.out.println("Conexión seleccionada:");
        System.out.println("IP: " + ipSeleccionada);
        System.out.println("Usuario: " + usuarioSeleccionado);
        System.out.println("Contraseña: " + contrasenaSeleccionada);
    }
}
