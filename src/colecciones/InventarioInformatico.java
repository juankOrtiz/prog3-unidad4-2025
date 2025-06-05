package colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InventarioInformatico {
    public static void main(String[] args) {
        Map<String, Producto> inventario = new HashMap<>();

        // 1) Agregar entradas (clave, valor)
        inventario.put("P0001", new Producto("Notebook Acer Aspire 3 15", 1000000, 20));
        inventario.put("P0002", new Producto("Auricular gamer Acer", 100000, 3));
        inventario.put("P0003", new Producto("Teclado Gamer Acer", 70000, 5));
        inventario.put("P0004", new Producto("Monitor Samsung 24''", 200000, 1));

        System.out.println(inventario);

        // 2) Puedo agregar una clave duplicada? Si, pero reemplaza la entrada anterior
        inventario.put("P0004", new Producto("Monitor Samsung 26''", 220000, 1));
        System.out.println(inventario);

        // 3) Leer valores segun su clave (controlar que no sea null)
        Producto producto = inventario.get("P0005");
        if(producto != null) {
            System.out.println("Producto: " + producto);
        } else {
            System.out.println("No existe el producto buscado");
        }

        // 4) Metodos accesorios para claves y valor
        System.out.println("Existe el codigo P0002? " + inventario.containsKey("P0002"));
        System.out.println("Existe el codigo P0005? " + inventario.containsKey("P0005"));
        System.out.println("Existe un producto de teclado mecanico con un precio de 100000 y 20 de stock? " + inventario.containsValue(new Producto("Teclado mecanico", 100000, 20)));

        // 5) Eliminar entrada
        Producto itemEliminado = inventario.remove("P0004");
        if(itemEliminado != null) {
            System.out.println("Producto eliminado: " + itemEliminado.getNombre());
        }

        // 6) Comprobar tamanio del mapa
        System.out.println("Numero de productos: " + inventario.size());
        System.out.println("Esta el inventario vacio? " + inventario.isEmpty());

        // 7) Iterar sobre el mapa
        // 7.1) Conjunto de entradas del mapa
        for(Map.Entry<String, Producto> entrada : inventario.entrySet()) {
            System.out.println("Codigo: " + entrada.getKey() + ", Info del producto: " + entrada.getValue().getNombre());
        }

        // 7.2) Conjunto de claves del mapa
        for(String codigo : inventario.keySet()) {
            System.out.println("Codigo de producto: " + codigo);
        }

        // 7.3) Conjunto de valores del mapa
        for(Producto itemProducto : inventario.values()) {
            System.out.println("Nombre del producto: " + itemProducto.getNombre());
        }

        // 7.4) Foreach (Java 8+)
        inventario.forEach((String clave, Producto otroProducto) ->
            System.out.println("Codigo: " + clave + " Nombre: " + otroProducto.getNombre())
        );

        // 8) Actualizar el stock de un producto
        Producto teclado = inventario.get("P0003");
        if(teclado != null) {
            teclado.setStock(teclado.getStock() + 10);
            System.out.println("El nuevo stock del teclado es: " +teclado.getStock());
        }

        // 9.1) Crear un TreeMap: usa un orden natural (alfabetico ascendente, numerico ascendente)
        Map<String, Producto> inventarioOrdenado = new TreeMap<>(inventario);
        // inventarioOrdenado.putAll(inventario);
        inventarioOrdenado.put("A0004", new Producto("Monitor Samsung 24''", 200000, 1));
        System.out.println(inventarioOrdenado);

        // 9.2) Crear un TreeMap: respeta el orden de insercion
        Map<String, Producto> inventarioOrdenadoQuizas = new LinkedHashMap<>(inventario);
        // inventarioOrdenado.putAll(inventario);
        inventarioOrdenadoQuizas.put("A0004", new Producto("Monitor Samsung 24''", 200000, 1));
        inventarioOrdenadoQuizas.put("Z0004", new Producto("Monitor Samsung 24''", 200000, 1));
        inventarioOrdenadoQuizas.put("A0005", new Producto("Monitor Samsung 24''", 200000, 1));
        System.out.println(inventarioOrdenadoQuizas);

        // 10) Eliminar todo
        inventario.clear();
        System.out.println("Esta vacia la lista de productos? " + inventario.isEmpty());
    }
}
