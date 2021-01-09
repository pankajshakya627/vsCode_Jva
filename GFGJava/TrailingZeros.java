import java.util.Scanner;
class TrailingZeros
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		System.out.println(countZeros(num));		
	}
	
	public static int countZeros(int n)
	{
		int res =0;
		for(int i=5; i<=n; i=i*5)
			res = res + n/i;
		return res;
	}
}