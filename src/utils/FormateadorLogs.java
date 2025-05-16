package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class FormateadorLogs extends Formatter {
    // Defino el formato de fecha que necesito
    private final SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Override
    public String format(LogRecord logRecord) {
        return String.format("%s [%s] %s%n",
                formatoFecha.format(new Date(logRecord.getMillis())),
                logRecord.getLevel(),
                formatMessage(logRecord));
    }
}
