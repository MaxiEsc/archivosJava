package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("¡¡Se ha creado el archivo con exito!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombre, String contenido) {

        File archivo = new File(nombre);
        try {
            PrintWriter escribir_archivo = new PrintWriter(archivo);
            escribir_archivo.println(contenido);
            escribir_archivo.close();
            System.out.println("¡¡Se ha escrito el archivo con exito!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void anexarArchivo(String nombre, String contenido){
           
        File archivo = new File(nombre);
        try {
            PrintWriter agregar_archivo = new PrintWriter(new FileWriter(archivo,true));
            agregar_archivo.println(contenido);
            agregar_archivo.close();
            System.out.println("¡¡Se ha agregado contenido al archivo con exito!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
             e.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            //BufferedReader no se usa para simplificar codigo
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("Lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        
    }
}
