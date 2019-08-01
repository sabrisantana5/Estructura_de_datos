/*Programa que multiplica los elementos de un arreglo excepto por sí mismo, de forma recursiva}
Respuesta: [120, 60, 40, 30, 24]
2*3*4*5 = 120
1*3*4*5 = 60
1*2*4*5 = 40
*/
import java.util.*;
public class VectorRecursiva{
	public static void main(String[] args){

		int[] a = {1,2,3,4,5};
		int[] b = {1,1,1,1,1};

		System.out.println(Arrays.toString(VecRec(a,b,a.length-1)));
	}

	public static int[] VecRec(int[] a, int[] b,int n){ //arreglo y numero de la posición donde se encuentra el numero que quieres


		if(n == -1)
			return b;
		else
		{
			for(int i = 0; i<a.length; i++)
			{
				if(n != i)
				b[n] *= a[i];
			}
			return VecRec(a,b,n-1);
		}
	}
}