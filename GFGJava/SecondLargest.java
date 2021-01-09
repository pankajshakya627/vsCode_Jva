import java.util.Scanner;
class SecondLargest
{
	static void secendLargest(int[] a)
	{
		int n = a.length;
		int l = Integer.MIN_VALUE;
		for (int i=0; i<n; i++)
		{
			if(l<a[i])
			{
				l = a[i];
			}	

		}
		int sl=Integer.MIN_VALUE;;
		for (int i=0; i<n; i++)
		{
			if(a[i]!=l && sl<a[i])
			{
				sl = a[i];			
			}	

		}
		System.out.println(sl);

	}
	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		secendLargest(arr);
	}
}