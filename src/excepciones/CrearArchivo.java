package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("puntajes.txt");
        if(archivo.exists()) {
            System.out.println("Ya existe el archivo. Finalizando...");
            System.exit(1);
        }

        //1) Gestion manual
        // Crear el archivo
        // PrintWriter salida = new PrintWriter(archivo);

        // Escribir la salida al archivo
        /*salida.print("Juan Carlos Ortiz ");
        salida.println(100);
        salida.print("Diamela Helin ");
        salida.println(125);
        salida.print("Lautaro Horodeski ");
        salida.println(95);*/

        // Cerrar el archivo
        // salida.close();

        //2 ) Usar el bloque try-with
        try(
            // Crear el archivo
            PrintWriter salida = new PrintWriter(archivo);
        ) {
            // Escribir la salida al archivo
            salida.print("Juan Carlos Ortiz ");
            salida.println(100);
            salida.print("Diamela Helin ");
            salida.println(125);
            salida.print("Lautaro Horodeski ");
            salida.println(95);
        }
    }

}
