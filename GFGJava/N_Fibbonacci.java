import java.util.Scanner;
class N_Fibbonacci
{

	static void n_Fibbonacci(int n, int m)
	{
		
		// Here m>n;
		int a[] = new int[m];
		for(int i=0; i<m; i++)
			a[i]=0;
		a[n-1] = 1;
		a[n] = 1;
		for (int i=n+1; i<m; i++) 
			a[i] = 2*a[i-1] - a[i-n-1];

		for (int i=0; i<m;i++ ) 
			System.out.print(a[i]+" ");
		
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		n_Fibbonacci(n, m);
	}
}