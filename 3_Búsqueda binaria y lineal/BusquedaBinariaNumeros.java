public class BusquedaBinariaNumeros{
	public static void main(String[] args){

	int a[] = {1,2,3,4,5,6,7,8,9,10};
	buscarBinaria(a,7);
	buscarBinaria(a,3);
	buscarBinaria(a,12);
	buscarBinaria(a,0);
	}
	public static int buscarBinaria(int[] a, int x){
		int linf = 0;
		int lsup = a.length-1;

			while(linf<=lsup){
				int pMedio = (lsup+linf)/2;
				if(x==a[pMedio]){
					System.out.printf("Se ha encontrado el numero %d en la posicion %d del arreglo\n",x,pMedio);
					return pMedio;
				}
				if(x<a[pMedio]){
					lsup = pMedio-1;
				}
				else{		//if(x>a[pMedio])
					linf = pMedio+1;
				}
				if(linf>lsup){
					System.out.printf("El numero %d no se encuentra en el arreglo\n",x);
				}

			}
			return -1;
		}
}
/* Notas :)
public class Numeros{
	public static void main(String[] args){

	int a[] = {1,2,3,4,5,6,7,8,9,10};
			int lsup = a.length-1;
			int linf = 0;
			int x = 7;
			boolean encontrado = false;

			while(encontrado==false){

			int pMedio = (lsup+linf)/2;

			if (lsup-linf==0){
				if(x==a[pMedio]){
					System.out.printf("Se ha encontrado el numero %d en la posicion %d del arreglo\n",x,pMedio);
					encontrado = true;
				}
				else{
					System.out.printf("El numero %d no se encuentra en el arreglo\n",x);
					encontrado = true;
				}
			}
			else{
				if(x<a[pMedio]){
					lsup = pMedio-1;
					linf = linf;
					encontrado = false;
				}
				else {//if(x>a[pMedio]){
					lsup = lsup;
					linf = pMedio+1;
					encontrado = false;
				}

			}
		}

	}
}
*/