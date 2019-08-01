/* Programa que muestra algunos tipos de ordenamiento
Realizado en Netbeans */
package ordenamiento;
import java.util.Random;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Main m = new Main(); //si mis metodos son estaticos no necesitas crear un main
       Persona[] lista = m.inicializaLista(5);
       //Intercambio
       System.out.println("Intercambio");
       long startTime = System.nanoTime();
       Intercambio.intercambioFnacimiento(lista);
       long endTime = System.nanoTime();
       long timeElapsed = endTime-startTime;
       m.imprimeLista(lista);
       System.out.println("Nanoseconds: "+timeElapsed);
       System.out.println("Miliseconds: "+timeElapsed/1000000);
       //Seleccion
       Persona[] lista2 = m.inicializaLista(5);
       System.out.println("Seleccion");
       Seleccion.seleccionFnacimiento(lista2);
       m.imprimeLista(lista2);
       //Insercion
       Persona[] lista3 = m.inicializaLista(5);
       System.out.println("Insercion");
       Insercion.insercionFnacimiento(lista3);
       m.imprimeLista(lista3);
       //si es estatico, alt enter para crear en el otro lugar
      //Burbuja
       Persona[] lista4 = m.inicializaLista(5);
       System.out.println("Burbuja");
       Burbuja.ordenaBurbujaFNacimiento(lista4);
       m.imprimeLista(lista4);
        //QuickSort
        Persona[] lista5 = m.inicializaLista(5);
        System.out.println("QuickSort");
        QuickSort.QuickSortFnacimiento(lista5,0, lista5.length-1);
        m.imprimeLista(lista5);
        //MergeSort
        Persona[] lista6 = m.inicializaLista(5);
        System.out.println("MergeSort");
        MergeSort.MergeSortFnacimiento(lista6,0,lista6.length-1);
        m.imprimeLista(lista6);
    }
    //debugear el de la derecha del play se runea pero se para donde esta mal y te explica porque
  //con f8 va haciendo todo por lineas

    public Persona[] inicializaLista(int tam){
               Persona[] lista = new Persona[tam];
               Random aleatorio = new Random();
		for (int i = 0;i<tam;i++)
                {
                    lista[i] = new Persona(creaStringAleatorio(),"B","C",aleatorio.nextInt(1019)+1000,aleatorio.nextInt(88888889)+11111111);
		}
                return lista;
        }
    public void imprimeLista(Persona[] lista){
        for (Persona lista1 : lista) {
            //fori y tabulador
            System.out.println(lista1);
        }
    }
    public String creaStringAleatorio(){
        String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        Random random = new Random();
        int randomLen = 1+random.nextInt(9);
        for (int i = 0; i < randomLen; i++) {
            char c = alphabet.charAt(random.nextInt(26));
            s+=c;
        }
        return s;
    }
}
//alt shift enter para duplicar
//alt shift flechitas para mover la linea
