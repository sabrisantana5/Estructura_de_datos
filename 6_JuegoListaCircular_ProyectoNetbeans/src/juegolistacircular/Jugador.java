package juegolistacircular;
public class Jugador {
    private int jugada;
    private Jugador siguiente;
    private Jugador anterior;
    
    private static int elementos = 0;

    public Jugador(int jugada) {
        this.jugada = jugada;
        elementos++;
    }
    public void eliminar(){
        this.getAnterior().setSiguiente(this.getSiguiente());
	this.getSiguiente().setAnterior(this.getAnterior());		
        this.setSiguiente(null);
        this.setAnterior(null);
	elementos--;
	}

    public int getJugada() {
        return jugada;
    }

    public void setJugada(int jugada) {
        this.jugada = jugada;
    }

    public Jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }
    
    public Jugador getAnterior() {
        return anterior;
    }

    public void setAnterior(Jugador anterior) {
        this.anterior = anterior;
    }
    public int getElementos(){
	return elementos;
	}
    
    @Override
	public String toString(){
		return "Jugada: " +  this.jugada + " Anterior: " + (anterior != null) + " Siguiente: " + (siguiente != null);
	}
    
    
}
