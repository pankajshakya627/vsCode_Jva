import java.util.Scanner;
class CheckRotation
{
	static void rotetArray(int[] a)
	{
		int n = a.length;
		int min = 0;
		int c=0;
		int m = Integer.MAX_VALUE;
		for (int i=0; i<n; i++)
		{
			if(m>a[i])
			{
				m = a[i];
				c=i;
			}
		}		
		System.out.println(c);

	}
	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		rotetArray(arr);
	}
}