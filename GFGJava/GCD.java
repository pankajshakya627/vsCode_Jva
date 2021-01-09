import java.util.Scanner;
class GCD
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(gcdnaive(num1, num2));		
	}

	// Naive Solution
	static int gcdnaive(int a, int b)
	{
		int max = Math.max(a,b);
		while(max>0)
		{
			if(a%max==0 && b%max==0)
				break;
			max--;
		}
		return max;
	}

	// Efficient Solution
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		return gcd(b, a%b);
	}

}