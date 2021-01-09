import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(isPrime(a)==true)
			System.out.println(a+" is Prime");
		else
			System.out.println(a+" is not Prime");
	}

	static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for(int i=5; i*i<=n; i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}
}