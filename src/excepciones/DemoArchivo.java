package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoArchivo {
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("prueba.txt");
        try {
            Scanner ingreso = new Scanner(archivo);
            while(ingreso.hasNext()) {
                String nombre = ingreso.next();
                String apellido = ingreso.next();
                System.out.println("Nombre: " + nombre + " - Apellido: " + apellido);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el archivo");
        } finally {
            System.out.println("Finalizando el programa...");
        }
    }
}
