package excepciones;

import utils.AppLogger;

import java.util.logging.Logger;

public class PruebaLogger {
    public static void main(String[] args) {
        Logger logger = AppLogger.getLogger(PruebaLogger.class.getName());

        logger.info("Se inicio el programa");
        logger.warning("ADvertencia, quedo una conexion a BD abierta");
        logger.severe("Error, paso algo");
    }
}
