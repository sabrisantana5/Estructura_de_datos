public class Persona{
	private String nombre;
	private int edad;
	private Persona siguiente;
	private Persona previo;

	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public void setSiguiente(Persona siguiente) {
		this.siguiente = siguiente;
	}

	public void setPrevio(Persona previo) {
		this.previo = previo;
	}

	public Persona getSiguiente() {
		return siguiente;
	}

	public Persona getPrevio(){
		return previo;
	}

	@Override
	public String toString(){
		return "Nombre: " +  this.nombre + " Edad: " + this.edad + " Perevio: " + (previo != null) + " Siguiente: " + (siguiente != null);
	}
}