package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;

public class PruebaArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombresArray = new ArrayList<>();
        LinkedList<String> nombresLinked = new LinkedList<>();

        // Testear ingresar 10.000 elementos
        long inicio = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            nombresArray.add(0, "HOLA");
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo ArrayList: " + (fin - inicio));

        inicio = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            nombresLinked.add(0, "HOLA");
        }
        fin = System.nanoTime();
        System.out.println("Tiempo LinkedList: " + (fin - inicio));
    }
}
