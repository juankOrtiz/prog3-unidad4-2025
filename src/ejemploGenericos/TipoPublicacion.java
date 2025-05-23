package ejemploGenericos;

public abstract class TipoPublicacion {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public TipoPublicacion(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Devuelve la descripcion especifica de cada item
    public abstract String obtenerDescripcion();

    @Override
    public String toString() {
        return obtenerDescripcion();
    }
}
