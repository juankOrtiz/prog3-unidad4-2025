package excepciones;

import utils.AppLogger;

import java.util.logging.Logger;

public class PruebaCriculo {
    public static void main(String[] args) throws RadioInvalidoException {
        Circulo c1 = new Circulo(5);
        try {
            Circulo c2 = new Circulo(-1);
            System.out.println(c2.getRadio());
        } catch (RadioInvalidoException e) {
            Logger logger = AppLogger.getLogger(PruebaLogger.class.getName());
            logger.warning(e.getMessage());
        }
    }
}
