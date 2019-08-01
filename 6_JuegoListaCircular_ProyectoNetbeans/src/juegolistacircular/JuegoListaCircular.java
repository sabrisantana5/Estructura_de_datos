/* Programa que realiza un juego a través de una lista de personas que se sientan en círculo
Realizado en Netbeans */
package juegolistacircular;
public class JuegoListaCircular {
    public static void main(String[] args) {
       Jugador j1 = new Jugador(2);
       Jugador j2 = new Jugador(1);

       j1.setSiguiente(j2);
       j2.setAnterior(j1);
       j2.setSiguiente(j1);
       j1.setAnterior(j2);

       System.out.println("El jugador 1 dice PAR");
       printSiguiente(j1);
       System.out.println("El jugador 1 pierde. \n\n Siguiente jugada:");

       System.out.println("El jugador 2 dice PAR");
       j1.setJugada(1);
       j2.setJugada(2);
       printSiguiente(j1.getSiguiente());
       System.out.println("El jugador 2 pierde. \n\n Siguiente jugada:");

       System.out.println("El jugador 1 dice PAR");
       j1.setJugada(2);
       j2.setJugada(2);
       printSiguiente(j1.getSiguiente().getSiguiente());
       System.out.println("El jugador 1 gana. \n");


    }
    private static void printSiguiente(Jugador p){
		System.out.println("Jugador 1 "+p);
		int cont = 1;
		while(cont < p.getElementos()){
			p = p.getSiguiente();
			System.out.println("Jugador "+(cont+1)+" "+p);
			cont++;
		}
	}
}
