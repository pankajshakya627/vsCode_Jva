import java.util.Scanner;
class SubarraySum
{
	static boolean isSubSum(int[] a, int sum)
	{
		int n = a.length;
		int curr_sum = a[0], s=0;
		for (int e=1; e<n; e++) 
		{
			while(curr_sum > sum && s<e-1)
			{
				curr_sum -= a[s];
				s++;
			}
			if(curr_sum == sum)
				return true;
			if(e<n)
				curr_sum += a[e];			
		}
		return (curr_sum==sum);
	}

	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();
		System.out.print(isSubSum(arr,sum));
	}
}