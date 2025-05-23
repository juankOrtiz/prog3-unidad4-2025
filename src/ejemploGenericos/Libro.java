package ejemploGenericos;

public class Libro extends TipoPublicacion {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String obtenerDescripcion() {
        return "Libro: " + titulo + " escrito por " + autor + " en " + anioPublicacion + ", tiene " + numeroPaginas + " paginas";
    }
}
