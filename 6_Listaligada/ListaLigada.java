/* Programa que muestra una lista ligada de personas*/
public class ListaLigada{
	public static void main(String[] args) {
		Persona p1 = new Persona("someone",13);
		Persona p2 = new Persona("mid", 42);
		Persona p3 = new Persona("ultimo", 300);

		p1.setSiguiente(p2);
		p2.setPrevio(p1);
		p2.setSiguiente(p3);
		p3.setPrevio(p2);


		System.out.println("Lista original");
		printSiguiente(p1);

		System.out.println("\n\nEliminando al ultimo");
		p1.getSiguiente().setSiguiente(null);
		printSiguiente(p1);

		System.out.println("\n\nVolviendolo a meter");
		p1.getSiguiente().setSiguiente(new Persona("Heman", 3000));
		printSiguiente(p1);

		System.out.println("\n\nSustituir al de enmedio");
		p1.setSiguiente(p1.getSiguiente().getSiguiente());
		printSiguiente(p1);
	}

	private static void printSiguiente(Persona p){
		System.out.println(p);
		while(p.getSiguiente() != null){
			p = p.getSiguiente();
			System.out.println(p);
		}
	}

	private static void printPrevio(Persona p){
		System.out.println(p);
		while(p.getPrevio() != null){
			p = p.getPrevio();
			System.out.println(p);
		}
	}
}