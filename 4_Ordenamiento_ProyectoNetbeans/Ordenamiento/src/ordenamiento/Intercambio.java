package ordenamiento;
public class Intercambio {
    
    public static void intercambioFnacimiento(Persona[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                Persona p1 = lista[i];
                Persona p2 = lista[j];
                if(p2.getAnio()< p1.getAnio()){
                lista[i] = p2;
                lista[j] = p1;
                 }
            }
            
         }
    }  
        protected static void intercambioNombre(Persona[] lista){
         for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                Persona p1 = lista[i];
                Persona p2 = lista[j];
                if(p2.getNombre().compareTo(p1.getNombre())<0){ //>0 izq mayor a derecha
                lista[i] = p2;
                lista[j] = p1;
                 }
            }
        
         }
    }
}

//compara varias veces los elementos ya ordenados con el for ya que checa desde el 0 hasta el ultimo y eso 
//lo hace ineficiente