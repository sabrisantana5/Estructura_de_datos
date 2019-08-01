public class BusquedaBinariaNumerosRecursiva{
	public static void main(String[] args){

	int a[] = {1,2,3,4,5,6,7,8,9,10};
			int lsup = a.length-1;
			int linf = 0;
			buscar(a,2,linf,lsup);
			buscar(a,7,linf,lsup);
			buscar(a,0,linf,lsup);
			buscar(a,12,linf,lsup);
	}

	public static int buscar(int[] a, int x, int linf, int lsup){

			if(linf>lsup){
				System.out.printf("El numero %d no se encuentra en el arreglo\n",x);
			return -1;
			}

			int pMedio = (linf+lsup)/2;

		 	if(x==a[pMedio]){
				System.out.printf("Se ha encontrado el numero %d en la posicion %d del arreglo\n",x,pMedio);
				return pMedio;
			}
			else if(x<a[pMedio]){
				return buscar(a,x,linf,pMedio-1);
			}
			else{
				return buscar(a,x,pMedio+1,lsup);
			}
	}
}