import java.util.Scanner;
class SlidingWindowNaive
{
	static int slidingWindowNaive(int[] a, int k)
	{
		int n = a.length;
		int max_sum = Integer.MIN_VALUE;
		for (int i=0; i+k-1<n; i++)
		{
			int sum=0;
			for (int j=0; j<k; j++) 
			{
				sum += a[i+j];				
			}
			max_sum = Math.max(max_sum,sum);
		}
		return max_sum;
	}
	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		System.out.print(slidingWindowNaive(arr,k));
	}
}