package excepciones;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class LeerDesdeUrl {
    public static void main(String[] args) {
        System.out.println("Ingresa una URL: ");
        String ingresoUrl = new Scanner(System.in).next();
        try {
            URL url = new URL(ingresoUrl);
            int contador = 0;
            Scanner ingreso = new Scanner(url.openStream());
            while(ingreso.hasNext()) {
                String linea = ingreso.nextLine();
                contador += linea.length();
            }
            System.out.println("La cantidad de caracteres es de " + contador);
        } catch(MalformedURLException ex) {
            System.out.println("La URL no es esta formateada correctamente");
        } catch (IOException ex) {
            System.out.println("No existe esa URL");
        }
    }
}
