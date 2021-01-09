import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(lcmnaive(num1, num2));		
	}	

	// LCM Efficient Solution
	static int lcmnaive(int a, int b)
	{
		int mul = a*b,res=0;
		int max = Math.max(a,b);
		for(int i=max; i<=mul; i++)
		{
			if(mul%i==0 && mul%i==0)
			{
				res = i;
				break;
			}
		}
		return res;
	}

	// Efficient solution
	static int lcm(int a, int b)
	{
		int lcm = (a*b)/gcd(a,b);
		return lcm;
	}
	// Efficient Solution gcd
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
}