package colecciones;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PruebaTareas {
    public static void main(String[] args) {
        PriorityQueue<Tarea> tareas = new PriorityQueue<>(Comparator.comparingInt(t -> t.getPrioridad()));
        // Invertir orden
        // PriorityQueue<Tarea> tareas = new PriorityQueue<>((t1, t2) -> Integer.compare(t2.getPrioridad(), t1.getPrioridad()));

        tareas.offer(new Tarea("Estudiar para Matematica", 1));
        tareas.offer(new Tarea("Jugar toda la noche sin dormir", 3));
        tareas.offer(new Tarea("Comer bien (nada de pavadas)", 2));

        while (tareas.size() > 0) {
            System.out.println("Procesando: " + tareas.poll());
        }
    }
}
