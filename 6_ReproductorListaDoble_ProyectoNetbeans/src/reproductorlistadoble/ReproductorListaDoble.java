/* Programa que simula un reproductor de canciones a través de listas
Realizado en Netbeans */
package reproductorlistadoble;
public class ReproductorListaDoble {
    public static void main(String[] args) {
      Cancion c1 = new Cancion("Build the cities");
      Cancion c2 = new Cancion("Drunk on you");
      Cancion c3 = new Cancion("Only u");
      Cancion c4 = new Cancion("Worlds colide");
      Cancion c5 = new Cancion("Symphony");

      c1.setSiguiente(c2);
      c2.setAnterior(c1);
      c2.setSiguiente(c3);
      c3.setAnterior(c2);
      c3.setSiguiente(c4);
      c4.setAnterior(c3);
      c4.setSiguiente(c5);
      c5.setAnterior(c4);

      System.out.println("La playlist es:");
		printSiguiente(c1);
                agregaCancionDespues(c5, "Mr Brightside");
      System.out.println("\nAgregaste \\\"Mr Brightside\\\" al final de la playlist");
               agregaCancionAntes(c1, "Hello");
       System.out.println("\nAgregaste \\\"Hello\\\" al inicio de la playlist");
                agregaCancionDespues(c2, "In the middle");
       System.out.println("\nAgregaste \\\"In the middle\\\" despues de \\\"Drunk on you\\\"");
                agregaCancionAntes(c4, "I dont love you");
       System.out.println("\nAgregaste \\\"I dont love you\\\" antes de \\\"Worlds colide\\\"");
                eliminaCancion(c3);
       System.out.println("\nEiminaste \\\"Only you\\\" \n");

                System.out.println("La playlist es: ");
                printSiguiente(c1.getAnterior());
                System.out.println("La playlist al revÃ©s es: \n");
                printAnterior(c5.getSiguiente());
    }
       private static void printSiguiente(Cancion c){
		System.out.println(c);
		while(c.getSiguiente() != null){
			c = c.getSiguiente();
			System.out.println(c);
		}
                System.out.println();
	}
       	private static void printAnterior(Cancion c){
		System.out.println(c);
		while(c.getAnterior() != null){
			c = c.getAnterior();
			System.out.println(c);
		}
	}
        private static void agregaCancionDespues(Cancion c, String nombre){
             if(c.getSiguiente()==null){
               c.setSiguiente(new Cancion(nombre));
               c.getSiguiente().setAnterior(c);
            }
            else{
                Cancion temp = c.getSiguiente();
                c.setSiguiente(new Cancion(nombre));
                c.getSiguiente().setAnterior(c);
                c.getSiguiente().setSiguiente(temp);
                temp.setAnterior( c.getSiguiente());
            }
             System.out.println();
        }
        private static void agregaCancionAntes(Cancion c, String nombre){

            if(c.getAnterior()==null){
               c.setAnterior(new Cancion(nombre));
               c.getAnterior().setSiguiente(c);
            }
            else{
                Cancion temp = c.getAnterior();
                c.setAnterior(new Cancion(nombre));
                c.getAnterior().setSiguiente(c);
                c.getAnterior().setAnterior(temp);
                temp.setSiguiente( c.getAnterior());
            }
        }
        private static void eliminaCancion(Cancion c){
                c.getAnterior().setSiguiente(c.getSiguiente());
                c.getSiguiente().setAnterior(c.getAnterior());
               // c = null;


        }

}
