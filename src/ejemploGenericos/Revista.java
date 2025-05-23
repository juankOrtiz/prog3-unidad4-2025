package ejemploGenericos;

public class Revista extends TipoPublicacion {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override
    public String obtenerDescripcion() {
        return "Revista: " + titulo + " escrito por " + autor + " en " + anioPublicacion + ", es la edicion numero " + numeroEdicion;
    }
}
