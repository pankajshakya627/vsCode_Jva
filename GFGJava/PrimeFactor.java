import java.util.Scanner;
class PrimeFactor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		primeFactor(a);
		primeFactorEff(a);			
	}

	// Naive Approach 
	static void primeFactor(int n)
	{
		if(n==1)
			return;
		for(int i=2; i*i<n; i++)
		{
			while(n%i==0)
			{
				System.out.print(i+"\t");
				n = n/i;
			}
		}
		if(n>1)
			System.out.println(n+"\t");
	}

	// Efficient Approach
	static void primeFactorEff(int n)
	{
		if(n==1)
			return ;
		while(n%2==0)
		{
			System.out.println(" 2");
			n /=2;
		}
		while(n%3==0)
		{
			System.out.println(" 3");
			n /=3;
		}
		for (int i=5; i*i<=n; i=i+6) 
		{
			while(n%i==0)
			{
				System.out.println(i+"  ");
				n=n/i;
			}
			while(n%(i+2)==0)
			{
				System.out.println((i+2)+"  ");
				n=n/(i+2);
			}
		}
		if(n>3)
			System.out.print(n);
	}
}