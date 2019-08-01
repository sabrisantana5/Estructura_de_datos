public class FactorialRecursiva{
	public static void main(String[] args){

		System.out.println(FactRec(5));
	}

	public static int FactRec(int n){
		if(n<=1)
		return n;
		else
		return n*FactRec(n-1);
	}
}