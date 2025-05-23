package ejemploGenericos;

import java.util.ArrayList;

public class PruebaBiblioteca {
    public static void main(String[] args) {
        // Crear instancias de bibliotecas para diferentes tipos de items
        Biblioteca<Libro> bLibros = new Biblioteca<>();
        Biblioteca<Revista> bRevistas = new Biblioteca<>();

        bLibros.agregarItem(new Libro("1984", "George Orwell", 1949, 350));
        bLibros.agregarItem(new Libro("Rebelion en la Granja", "George Orwell", 1955, 300));
        bLibros.agregarItem(new Libro("El Principito", "Antoine", 1943, 100));

        bLibros.mostrarItems();

        ArrayList<Libro> librosOrwell = bLibros.buscarPorAutor("George Orwell");
        if(librosOrwell.isEmpty()) {
            System.out.println("No hay libros de George Orwell");
        } else {
            for(Libro libro : librosOrwell) {
                System.out.println(libro);
            }
        }
    }

}
