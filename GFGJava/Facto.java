import java.util.Scanner;
class Facto
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// int k = sc.nextInt();
		sc.close();
		// int k=1;
		// System.out.print(fact(num));
		System.out.print(fact1(num));
	}

	// rRecursive Solution

	static int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);//, k*n);
	}

	// iterative solution
	static int fact1(int n)
	{
		int fact = 1;
		for(int i=1; i<=n; i++)
			fact = i*fact;
		return fact;
	}
}