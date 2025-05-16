package excepciones;

public class RadioInvalidoException extends Exception {
    private final double radio;

    public RadioInvalidoException(double radio) {
        super("El radio es invalido: " + radio);
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }
}
