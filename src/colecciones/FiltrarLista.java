package colecciones;

import java.util.*;

public class FiltrarLista {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Juan", "Carlos", "Ana", "Carlos", "Lucio");
        System.out.println("Lista original: " + nombres);

        // 1) Filtrar elementos duplicados
        Set<String> nombresUnicos = new HashSet<>(nombres);
        System.out.println("Nombres unicos: " + nombresUnicos);

        // Si quiero, paso a una lista
        List<String> listaFiltrada = new ArrayList<>(nombresUnicos);
        listaFiltrada.add("Lara");

        // 2) Ordenar alfabeticamente
        Set<String> listaOrdenada = new TreeSet<>(listaFiltrada);
        System.out.println("Lista final, unica y ordenada: " + listaOrdenada);
    }
}
