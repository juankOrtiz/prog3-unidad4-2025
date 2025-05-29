package colecciones;

import java.util.PriorityQueue;

public class PruebaPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> fila = new PriorityQueue<>();
        fila.offer(20);
        fila.offer(10);
        fila.offer(15);
        fila.offer(5);
        System.out.println("Orden de la fila: " + fila);
    }
}
