package excepciones;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros para hacer la division: ");
        int dividendo = ingreso.nextInt();
        int divisor = ingreso.nextInt();
        try {
            float resultado = dividir(dividendo, divisor);
            System.out.println(dividendo + " / " + divisor + " es: " + resultado);
            int[] arreglo = new int[3];
            arreglo[0] = 1;
            arreglo[1] = 2;
            arreglo[2] = 3;
            System.out.println("Ingresa el indice del arreglo: ");
            int indice = ingreso.nextInt();
            System.out.println(arreglo[indice]);
        } catch (ArithmeticException e) {
            System.out.println("Ocurrio un error con el mensaje: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No se puede acceder al elemento");

            // MALAS
            // 1) Catch ahogado
            // 2) Usar System.out.println SOLAMENTE
            // 3) Usar Exception o RuntimeException

            // BUENAS
            // 1) Corregir datos de variables o resultados de metodo
            // 2) Usar logging
            // 2.1) Usar un sistema de rastreo de errores (Bugsnag, Sentry, DataDog)
            // 3) Reintentar acciones que han fallado
        }
    }

    public static int dividir(int dividendo, int divisor) {
        if(divisor == 0) {
            // Arrojar la excepcion manualmente
            throw new ArithmeticException("El divisor no puede ser 0");
        }
        return dividendo / divisor;
    }
}
