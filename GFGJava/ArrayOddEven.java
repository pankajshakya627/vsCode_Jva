import java.util.Scanner;
class ArrayOddEven
{
	public static void arrOddEven(int n)
	{
		for(int i=1; i<=n; i++)
		{
			if(i%2==1)
				System.out.print(i+" ");
		}
		for(int i=n; i>1; i--)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		arrOddEven(n);

	}
}