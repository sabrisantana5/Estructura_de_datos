package ordenamiento;
public class Insercion {
    public static void insercionFnacimiento(Persona[] lista){
            for (int i = 1; i < lista.length; i++) {
            Persona temp = lista[i];
            int j = i - 1;
            while(j >= 0 && lista[j].getAnio()> temp.getAnio()){
                lista[j+1] = lista[j];
                j -= 1;
            }
            lista[j+1] = temp;
        }
    }
        public static void insercionNombre(Persona[] lista){
            for (int i = 1; i < lista.length; i++) {
            Persona temp = lista[i];
            int j = i - 1;
            while((j >= 0) && (lista[j].getNombre().compareTo(temp.getNombre())>0)){
                lista[j+1] = lista[j];
                j -= 1;
            }
            lista[j+1] = temp;
        }
    }
}
