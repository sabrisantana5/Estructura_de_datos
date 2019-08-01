package reproductorlistadoble;
public class Cancion {
    private String titulo;
    private Cancion siguiente;
    private Cancion anterior;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Cancion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cancion siguiente) {
        this.siguiente = siguiente;
    }

    public Cancion getAnterior() {
        return anterior;
    }

    public void setAnterior(Cancion anterior) {
        this.anterior = anterior;
    }
    

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + '}';
    }
    
}
