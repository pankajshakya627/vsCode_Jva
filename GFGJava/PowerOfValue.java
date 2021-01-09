import java.util.Scanner;
import java.util.Arrays;
class PowerOfValue
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(power(a,b));		
	}
	static int power(int x, int n)
	{
		int res=1;
		for(int i=1;i<=n; i++)
		{
			res *= x;
		}
		return res;
	}

}