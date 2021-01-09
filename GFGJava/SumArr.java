import java.util.Scanner;
public class SumArr
{
	public static void main(String[] args) 
	{
		// Scanner sc = new Scanner(System.in);
		// int n= sc.nextInt();
		// int[] arr = new int[];
		// for(int i=0;i<n; i++)
		int[] arr = {1, 2, 2, 1, 13}; //{1, 2, 2, 1};
		System.out.print(sum13(arr));
	}
	static int sum13(int[] a)
	{
		int res =0;
		if(a.length==0)
			return 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=13)
				res += a[i];
		}
		return res;
	}
}