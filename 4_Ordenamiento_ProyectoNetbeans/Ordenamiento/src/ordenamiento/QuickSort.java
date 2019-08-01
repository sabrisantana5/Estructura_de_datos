package ordenamiento;
public class QuickSort {
    public static void QuickSortFnacimiento(Persona[] lista, int inicio, int fin){
       if(inicio<fin){
               int q = particionFnacimiento(lista,inicio,fin);       
               QuickSortFnacimiento(lista,inicio,q-1);
               QuickSortFnacimiento(lista,q+1,fin);
        }
    }
       public static int particionFnacimiento(Persona[] lista,int inicio, int fin){
           int pivote = lista[fin].getAnio();
           int ultimo = inicio - 1;
           for(int i = inicio; i<fin;i++){
               if(lista[i].getAnio()<pivote){
                   ultimo++;
                   intercambiar(lista,ultimo,i);
               }
           }
               intercambiar(lista,ultimo+1,fin);
               return ultimo+1;
       }
       public static void intercambiar(Persona[] lista,int e1,int e2){
          Persona temp = lista[e1];
          lista[e1]= lista[e2];
          lista[e2] = temp;     
       }
           public static void QuickSortNombre(Persona[] lista, int inicio, int fin){
       if(inicio<fin){
               int q = particionNombre(lista,inicio,fin);       
               QuickSortNombre(lista,inicio,q-1);
               QuickSortNombre(lista,q+1,fin);
        }
    }
       public static int particionNombre(Persona[] lista,int inicio, int fin){
           String pivote = lista[fin].getNombre();
           int ultimo = inicio - 1;
           for(int i = inicio; i<fin;i++){
               if(lista[i].getNombre().compareTo(pivote)<0){
                   ultimo++;
                   intercambiar(lista,ultimo,i);
               }
           }
               intercambiar(lista,ultimo+1,fin);
               return ultimo+1;
       }
} 
/*

Otra forma utilizando la mediana y el pseudocodigo visto en clase
public static void QuickSortFnacimiento(Persona[] lista,int inicio,int fin){
          int q;   
            if(inicio<fin){
               q = particion(lista,inicio,fin);       
               QuickSortFnacimiento(lista,inicio,q);
               QuickSortFnacimiento(lista,q+1,fin);
           }
    }
    public static int particion(Persona[] lista, int inicio, int fin){
        int x;
        Persona temporal;
        x = mediana3(lista,inicio, fin);
        int i = inicio - 1; 
        int j = fin + 1;
            do{
            j--;
            } while(lista[j].getAnio() > x);
            do{
                i++;
            } while(lista[i].getAnio() < x);
            if(i<j){
                temporal = lista[i];
                lista[i] = lista[j];
                lista[j] = temporal;
            }
            else{
                return i;
            }
            return i;
    }
    public static int mediana3(Persona[] lista, int inicio, int fin){
        int centro = (inicio + fin) / 2;
        
        if (lista[inicio].getAnio() > lista[centro].getAnio()){
         Persona temp = lista[inicio];
         lista[inicio]= lista[centro];
         lista[centro] = temp;
         }
        if (lista[inicio].getAnio() > lista[fin].getAnio()){
         Persona temp = lista[inicio];
         lista[inicio]= lista[fin];
         lista[fin] = temp;
        }
         if (lista[centro].getAnio() > lista[fin].getAnio()){
         Persona temp = lista[centro];
         lista[centro]= lista[fin];
         lista[fin] = temp;    
         }
       return lista[centro].getAnio();
    }
*/


   
