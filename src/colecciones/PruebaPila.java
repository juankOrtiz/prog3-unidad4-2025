package colecciones;

import java.util.Stack;

public class PruebaPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");

        System.out.println("Contenido de la pila es: " + pila);
        System.out.println("Elemento en el tope de la pila: " + pila.peek());
        System.out.println("Contenido actual de la pila: " + pila);
        System.out.println("Extraer elemento del tope: " + pila.pop());
        System.out.println("Contenido actual de la pila: " + pila);
    }
}
