
package ordenamiento;

public class Burbuja {
    public static void ordenaBurbujaFNacimiento(Persona[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
               if(lista[j].getAnio()>lista[j+1].getAnio()){
                Persona temp = lista[j];
                lista[j] = lista[j+1];
                lista[j+1] = temp;
               } 
            }
        }  
    }
     public static void ordenaBurbujaNombre(Persona[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
               if(lista[j].getNombre().compareTo(lista[j+1].getNombre())>0){
                Persona temp = lista[j];
                lista[j] = lista[j+1];
                lista[j+1] = temp;
               } 
            }
        }  
    }
}
