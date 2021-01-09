import java.util.Scanner;
class SlidingWindow
{
	static int slidingWindow(int[] a, int k)
	{
		int n = a.length;
		int curr_sum = 0;
		for (int i=0; i<k; i++)
			curr_sum += a[i];
		int max_sum = curr_sum;
		for (int i=k; i<n; i++) 
			{
				curr_sum += (a[i]-a[i-k]);	
				max_sum = Math.max(max_sum,curr_sum);
			}
		return max_sum;

	}
	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		System.out.print(slidingWindow(arr,k));
	}
}