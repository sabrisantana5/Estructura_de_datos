/* Programa que muestra secuencias de ·rboles: preorden, inorden y postorden
Realizado en Netbeans */
package tareaarboles;
public class TareaArboles {
  public static void main(String[] args){
        Nodo raiz = new Nodo(10);
        Nodo.insertar(raiz, 5);
        Nodo.insertar(raiz, 40);
        Nodo.insertar(raiz, 1);
        Nodo.insertar(raiz, 7);
        Nodo.insertar(raiz, 50);

        System.out.println("Preorden: ");
        Nodo.preorden(raiz);
        System.out.println("");
        System.out.println("Inorden: ");
        Nodo.inorden(raiz);
        System.out.println("");
        System.out.println("Postorden: ");
        Nodo.postorden(raiz);
        System.out.println("");
        System.out.println("Nivel: ");
        Nodo.nivel(raiz);
        System.out.println("");

        Nodo.borrar(raiz,40);
        System.out.println("Se elimin√≥ el 40");

        System.out.println("Preorden: ");
        Nodo.preorden(raiz);
        System.out.println("");
        System.out.println("Inorden: ");
        Nodo.inorden(raiz);
        System.out.println("");
        System.out.println("Postorden: ");
        Nodo.postorden(raiz);
        System.out.println("");
        System.out.println("Nivel: ");
        Nodo.nivel(raiz);
        System.out.println("");

    }

}
