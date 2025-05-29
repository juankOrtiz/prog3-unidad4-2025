package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PruebaIterador {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Carlos", "Pepe"));
        Iterator<String> it = nombres.iterator();

        while(it.hasNext()) {
            String nombre = it.next();
            if(nombre.equals("Ana")) {
                it.remove();
            }
        }

        System.out.println("Lista: " + nombres);
    }
}
