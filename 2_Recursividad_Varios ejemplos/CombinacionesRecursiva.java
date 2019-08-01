/*Programa que produce la siguiente salida dependiendo del número k (cantidad de numeros a combinar)
[1, 2, 3]
[1, 2, 4]
[1, 2, 5]
[1, 2, 6]
[1, 3, 4]
[1, 3, 5]
[1, 3, 6]
[1, 4, 5]
[1, 4, 6]
[1, 5, 6]
[2, 3, 4]
[2, 3, 5]
[2, 3, 6]
[2, 4, 5]
[2, 4, 6]
[2, 5, 6]
[3, 4, 5]
[3, 4, 6]
[3, 5, 6]
[4, 5, 6]*/

import java.util.Arrays;
public class CombinacionesRecursiva{

	public static void main(String[] args){

		int[] a = {1,2,3,4,5,6};
		int k = 3;
		int[] b = new int[k];
		Comb(a,k,0,b);

	}
	public static void Comb(int[] a, int k, int n, int[] b){
			if (k == 0){
				System.out.println(Arrays.toString(b));
				return;
			}
			for (int i = n; i <= a.length-k; i++){
				b[b.length - k] = a[i];
				Comb(a, k-1, i+1, b);
			}
	}
}


/*
Metodo para unicamente longitud 2
import java.util.Arrays;
public class CombinacionesRecursiva{

	public static void main(String[] args){

		int[] a = {1,2,3,4};
		int k = 2;
		int[] b = new int[k];

			Comb(a,b,0);

	}

	public static String Comb(int[] a,int[] b,int i){

		if(i>a.length-b.length){
				return "";
			}
			else
			{
				for(int p = 0; p<b.length-1; p++)
				{
					int v = i+1;
						while(v<a.length)
						{
						b[p] = a[i];
						b[p+1] = a[v];
						System.out.println(Arrays.toString(b));
						v++;
						}
				}

				return Comb(a,b,i+1);
		}
	}
}
*/