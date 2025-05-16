package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {
    private static Logger logger;

    private AppLogger() {}

    public static Logger getLogger(String nombreLogger) {
        if(logger == null) {
            try {
                // Crear la carpeta de logs (si no existe)
                Path carpetaLogs = Path.of("logs");
                if(!Files.exists(carpetaLogs)) {
                    Files.createDirectories(carpetaLogs);
                }

                // Crear el archivo de log
                String logPath = carpetaLogs.resolve("app.log").toString();
                FileHandler fh = new FileHandler(logPath, true);
                // Utilizar implementacion personalizada para logs
                fh.setFormatter(new FormateadorLogs());

                // Configurar el log
                logger = Logger.getLogger(nombreLogger);
                logger.addHandler(fh);
                logger.setUseParentHandlers(false);
                logger.setLevel(Level.ALL);
            } catch (IOException | SecurityException e) {
                e.printStackTrace();
            }
        }
        return logger;
    }
}
