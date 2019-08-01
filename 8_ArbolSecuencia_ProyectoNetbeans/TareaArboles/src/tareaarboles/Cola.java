package tareaarboles;
import java.util.Arrays;

public class Cola {
    private static final int TAM_MAX = 10;
    private int contador;
    private int primero;
    private Nodo[] elem;

    public Cola() {
        primero = 0;
        contador = 0;
        elem = new Nodo[TAM_MAX];
    }
    public boolean encolar(Nodo elemento){
       elem[contador]=elemento;
       contador++;
       return true;
    }
    public boolean desencolar() {
        primero++;
        return true;
    }
    public Nodo top() {
       return elem[primero];
    }
    public String toString() {
       
        return "Pila{" + "elem=" + Arrays.toString(elem) + '}';
    }
    
}

