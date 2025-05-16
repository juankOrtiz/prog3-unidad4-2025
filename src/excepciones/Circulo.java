package excepciones;

public class Circulo {
    private double radio;

    public Circulo(double radio) throws RadioInvalidoException {
        setRadio(radio);
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) throws RadioInvalidoException {
        if(radio >= 0) {
            this.radio = radio;
        } else {
            throw new RadioInvalidoException(radio);
        }
    }
}
