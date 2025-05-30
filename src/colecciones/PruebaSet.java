package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebaSet {
    public static void main(String[] args) {
        Set<String> ciudades = new HashSet<>();
        ciudades.add("Obera");
        ciudades.add("Posadas");
        ciudades.add("Alem");
        ciudades.add("Obera");
        System.out.println(ciudades);
        System.out.println("Cuantas ciudades hay? " + ciudades.size());
        System.out.println("Existe Alem? " + ciudades.contains("Alem"));

        for(String ciudad : ciudades) {
            System.out.println(ciudad.toUpperCase());
        }

        TreeSet<String> ciudades2 = new TreeSet<>(ciudades);
        ciudades2.add("Iguazu");
        System.out.println(ciudades2);
        System.out.println("Primer elemento: " + ciudades2.first());
        System.out.println(ciudades2.headSet("Montecarlo"));
        System.out.println(ciudades2.tailSet("Iguazu"));
        System.out.println(ciudades2.lower("P"));
        System.out.println(ciudades2.higher("P"));
    }
}
