
package tareaarboles;

public class Nodo {
    
    private int dato;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo() {
        this.dato = -1;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
    public Nodo(int dato, Nodo izquierdo, Nodo derecho) {
        this.dato = dato;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    
    public static Nodo buscar(Nodo n, int dato){
          if(n==null){
                return null;
            } else if(dato<n.getDato()){
               return buscar(n.getIzquierdo(),dato);
            } else if(n.getDato()==dato){
                return n;
            }
          // if(n.getDato()<dato){
          return buscar(n.getDerecho(), dato);
             
    }
    public static Nodo insertar(Nodo n, int dato){
            if(n==null){
                return new Nodo(dato);
            } else if(dato<n.getDato()){
                n.setIzquierdo(insertar(n.getIzquierdo(),dato));
            } else if(n.getDato()<dato){
                n.setDerecho(insertar(n.getDerecho(),dato));
            } else if(n.getDato()==dato){
                //actualizar
                //n.setDato(dato);
            }
            return n;
        }
    public static void preorden(Nodo n){
        if(n!=null){
            System.out.print(n.getDato()+" "); //sout tab
            preorden(n.getIzquierdo());
            preorden(n.getDerecho());
        }
    }
    public static void inorden(Nodo n){
        if(n!=null){
            inorden(n.getIzquierdo());
            System.out.print(n.getDato()+" "); //alt shift abajo
            inorden(n.getDerecho());
        }
    }
    public static void postorden(Nodo n){
        if(n!=null){
            postorden(n.getIzquierdo());
            postorden(n.getDerecho());
            System.out.print(n.getDato()+" "); 
        }
    }
    public static void nivel(Nodo T){
        Cola c = new Cola();
        c.encolar(T);
        while(T!=null){
            System.out.print(T.getDato()+" ");
           if(T.getIzquierdo()!=null)
           c.encolar(T.getIzquierdo()); 
           if(T.getDerecho()!=null)
           c.encolar(T.getDerecho()); //visitar T y agregar sus hijos a una FIFO
           c.desencolar();
           T = c.top();
        }
    }
        public static Nodo buscarMinimo(Nodo T){
        if(T == null){
            return null;
        }  
        if(T.getIzquierdo() == null){
            return T;
        } 
        return buscarMinimo(T.getIzquierdo());
     }
     public static Nodo borrar(Nodo T, int x){
         Nodo N = buscar(T,x); //busca el numero que quieres borrar
         if((N.getDerecho()==null)&&(N.getIzquierdo()==null)) //si no tiene hijos pues nulo
             N = null;
         else if(N.getDerecho()==null){ //tiene un hijo, lo eliminas y remplazas el apuntador por el de su hijo
             N.setDato(N.getIzquierdo().getDato());
             N.setIzquierdo(borrar(N.getIzquierdo(),N.getIzquierdo().getDato()));
         }
         else if(N.getIzquierdo()==null){
             N.setDato(N.getDerecho().getDato());
             N.setDerecho(borrar(N.getDerecho(),N.getDerecho().getDato()));
         }
         else if((N.getDerecho()!=null)&&(N.getIzquierdo()!=null)){ //si tiene dos hijos
            Nodo temporal1 = buscarMinimo(N.getDerecho());   
            N.setDato(temporal1.getDato()); //copiar el valor menor en el subarbol derecho al nodo
            N.setDerecho(borrar(temporal1, temporal1.getDato()));
         }
         return N;
     }
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
    
}
