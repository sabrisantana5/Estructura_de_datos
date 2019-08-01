package ordenamiento;
public class MergeSort {
    public static void MergeSortFnacimiento(Persona[] lista, int inicio, int fin){
        if(inicio < fin){
            int medio = (inicio + fin)/2;
            MergeSortFnacimiento(lista, inicio, medio);
            MergeSortFnacimiento(lista, medio+1,fin);
            combinarFnacimiento(lista, inicio, medio, fin);
        }
    }
    public static void combinarFnacimiento(Persona[] lista, int inicio, int medio, int fin){
        Persona[] auxiliar = new Persona[fin - inicio + 1];
        int h = 0;
        int i = inicio;
        int j = medio + 1;
        while((i<=medio)&&(j<=fin)){
            if(lista[i].getAnio()<=lista[j].getAnio()){
                auxiliar[h] = lista[i];
                i+=1;
            }
            else{
                 auxiliar[h] = lista[j];
                 j+=1;
            }
            h=h+1;
        }
        if(i>medio){
            while(j<=fin){
                auxiliar[h] = lista[j];
                j+=1;
                h+=1;
            }
        }
        else{
            while(i <= medio){
                auxiliar[h] = lista[i];
                i+=1;
                h=h+1;
            }                      
        }
        for(h = 0; h < auxiliar.length;h++)
            lista[inicio + h] = auxiliar[h];
    }   
        public static void MergeSortNombre(Persona[] lista, int inicio, int fin){
        if(inicio < fin){
            int medio = (inicio + fin)/2;
            MergeSortNombre(lista, inicio, medio);
            MergeSortNombre(lista, medio+1,fin);
            combinarNombre(lista, inicio, medio, fin);
        }
    }
    public static void combinarNombre(Persona[] lista, int inicio, int medio, int fin){
        Persona[] auxiliar = new Persona[fin - inicio + 1];
        int h = 0;
        int i = inicio;
        int j = medio + 1;
        while((i<=medio)&&(j<=fin)){
            if(lista[i].getNombre().compareTo(lista[j].getNombre())<=0){
                auxiliar[h] = lista[i];
                i+=1;
            }
            else{
                 auxiliar[h] = lista[j];
                 j+=1;
            }
            h=h+1;
        }
        if(i>medio){
            while(j<=fin){
                auxiliar[h] = lista[j];
                j+=1;
                h+=1;
            }
        }
        else{
            while(i <= medio){
                auxiliar[h] = lista[i];
                i+=1;
                h=h+1;
            }                      
        }
        for(h = 0; h < auxiliar.length;h++)
            lista[inicio + h] = auxiliar[h];
    }   
}

