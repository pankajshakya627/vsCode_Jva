import java.util.Scanner;
class AllDivisionPrint
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		printDivisor(a);
		printDivisorEEf(a);			
	}

	// Naive Approach   O(n)
	static void printDivisor(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

	// Efficient Approach O(n^(1/2))
	static void printDivisorEEf(int n)
	{
		for(int i=1; i*i <=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				if(i!= n/i)
					System.out.println(n/i);
			}
		}
	}
}