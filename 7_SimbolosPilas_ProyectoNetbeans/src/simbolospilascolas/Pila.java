package simbolospilascolas;
import java.util.Arrays;

public class Pila {
    private static final int TAM_MAX = 6;
    private int tope;
    private Object[] elem;

    public Pila() {
        tope = TAM_MAX;
        elem = new Object[TAM_MAX];
    }
    public boolean push(Object elemento) {
       if(tope==0){
           return false;
       }
       tope--;
       elem[tope]=elemento;
       return true;
       //agrega elementos del final al inicio
    }
    public boolean pop() {
        if(esVacia()){
            return false;
        }
        //elem[tope]=null;
        tope++;
        return true;
    }
    public Object top() {
       if(esVacia()){
           return null;
       }
       return elem[tope];
    }
    public boolean vaciar() {
       tope = TAM_MAX;
       elem = new Object[TAM_MAX];
       return true;
       //confias en que el garbage colector y haces uno nuevo
    }
    public boolean esVacia() {
        return tope==TAM_MAX; //pregunta si tope es el tamaño maximo para saber si esta vacia
    }
    public Object Ultimo(){
        return elem[tope];
    }
    public String toString() {
       
        return "Pila{" + "elem=" + Arrays.toString(elem) + '}';
    }
    
}
