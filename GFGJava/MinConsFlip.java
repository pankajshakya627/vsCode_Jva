import java.util.Scanner;
class MinConsFlip
{
	static void minConsecutiveFlip(int[] a)
	{
		int n = a.length;
		for (int i=1; i<n; i++)
		{
			if(a[i]!=a[i-1])
			{
				if(a[i]!=a[0])
					System.out.print("From "+i+" to ");
				else
					System.out.println(i-1);
			}
		}
		if(a[n-1]!=a[0])	
			System.out.println(n-1);

	}
	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		minConsecutiveFlip(arr);
	}
}