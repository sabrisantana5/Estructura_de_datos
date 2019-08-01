package ordenamiento;
public class Seleccion { 
    public static void seleccionFnacimiento(Persona[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
           int menor = i;
           Persona ptemp;
            for (int j = i + 1; j < lista.length; j++) {
                    if(lista[j].getAnio() < lista[menor].getAnio()){
                        menor = j; 
                    }
                 }
            ptemp = lista[menor];
            lista[menor] = lista[i];
            lista[i] = ptemp;
            }   
         }
        public static void seleccionNombre(Persona[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
           int menor = i;
           Persona ptemp;
            for (int j = i + 1; j < lista.length; j++) {
                    if(lista[j].getNombre().compareTo(lista[menor].getNombre())<0){
                        menor = j; 
                    }
                 }
            ptemp = lista[menor];
            lista[menor] = lista[i];
            lista[i] = ptemp;
            }   
         }
    }    
