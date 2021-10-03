
package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, "Buenas tardes java!!");
        //anexarArchivo(nombreArchivo, "Salud");
        leerArchivo(nombreArchivo);
    }
}
