package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PruebaListas {
    public static void main(String[] args) {
        int numero = 0;
        List<Integer> lista = new ArrayList<>();
        // Agregar items a la lista
        lista.add(1);
        lista.add(2);
        lista.add(0, 3);
        // Leer valor segun el indice
        System.out.println(lista.get(1));
        System.out.println(lista);
        // Crear un iterador para recorrer la lista
        Iterator<Integer> it = lista.iterator();
        while(it.hasNext()) {
            System.out.println("El item es: " + it.next());
        }
    }

}
