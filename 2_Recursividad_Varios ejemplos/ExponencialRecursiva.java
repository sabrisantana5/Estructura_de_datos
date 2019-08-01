public class ExponencialRecursiva{
	public static void main(String[] args){

		System.out.println(ExpRec(5,3));
	}

	public static int ExpRec(int x, int n){
		if(n<=1)
		return x*n;
		else
		return x*ExpRec(x,n-1);
	}
}