import java.util.Scanner;
class Sort012
{
	static void sort012(int[] a)
	{
		int n = a.length;
		int min = 0;
		int c=0;
		int last=n-1;
		int m = Integer.MAX_VALUE;
		for (int i=0; i<n; i++)
		{
			if(a[i]==0)
			{
				int t = arr[i];
				arr[i] = arr[i];
				arr[i] = t;
				a[c] = a[i];
				c++;
			}
		}
		for (int i=c+1; i<n; i++)
		{
			if(a[i]==1)
			{
				a[c] = a[i];
				c++;
			}
		}
		for (int i=c+1; i<n; i++)
		{
			if(a[i]==2)
			{
				a[c] = a[i];
				c++;
			}
		}

		for (int i=0; i<n; i++)
		{
		System.out.print(a[i]+" ");
		}

	}
	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		sort012(arr);
	}
}