import java.util.Scanner;
import java.util.Arrays;
class SieveOfErathothemes
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sieveErathothemes(a);		
	}

	static void sieveErathothemes(int n)
	{
		if(n<=1)
			return;
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2; i*i<=n; i++)
		{
			if(isPrime[i])
			{
				for(int j=i*i; j<=n; j=j+i)
					isPrime[j] = false;
			}
		}
		for (int i=2; i<=n; i++) 
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}
}
