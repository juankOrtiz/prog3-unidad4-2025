package excepciones;

import java.io.File;

public class GestionArchivos {
    public static void main(String[] args) {
        File archivo = new File("prueba.txt");
        System.out.println("Existe? " + archivo.exists());
        System.out.println("Longitud: " + archivo.length());
        System.out.println("Puedo leer? " + archivo.canRead());
        System.out.println("Puedo escribir? " + archivo.canWrite());
        System.out.println("Es un archivo? " + archivo.isFile());
        System.out.println("Esta oculto? " + archivo.isHidden());
        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

    }
}
