package colecciones;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PruebaQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Primero");
        fila.add("Segundo");
        fila.add("Tercero");
        // offer() es el metodo nativo de las filas, es similar a add()
        fila.offer("Cuarto");

        System.out.println("Estado de la Fila: " + fila);
        System.out.println("Inspeccionar proximo elemento: " + fila.peek());
        System.out.println("Elemento eliminado: " + fila.poll());
        System.out.println("Estado de la Fila: " + fila);

        // Vaciar la fila completa
        while(fila.size() > 0) {
            System.out.println("-" + fila.remove());
        }

        System.out.println("Estado de la Fila: " + fila);
    }
}
