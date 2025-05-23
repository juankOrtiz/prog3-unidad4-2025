package ejemploGenericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Biblioteca<T extends TipoPublicacion> {
    private ArrayList<T> coleccionItems;

    public Biblioteca() {
        this.coleccionItems = new ArrayList<>();
    }

    public void agregarItem(T item) {
        coleccionItems.add(item);
    }

    public void mostrarItems() {
        if(coleccionItems.isEmpty()) {
            System.out.println("Biblioteca vacia");
            return;
        }
        System.out.println("Items de la biblioteca:");
        Iterator<T> it = coleccionItems.iterator();
        while(it.hasNext()) {
            T item = it.next();
            System.out.println("- " + item.obtenerDescripcion());
        }
    }

    public ArrayList<T> buscarPorAutor(String autor) {
        ArrayList<T> encontrados = new ArrayList<>();
        for(T item : coleccionItems) {
            if(Objects.equals(item.getAutor(), autor)) {
                encontrados.add(item);
            }
        }
        return encontrados;
    }
}
