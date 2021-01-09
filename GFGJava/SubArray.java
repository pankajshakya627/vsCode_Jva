import java.util.Scanner;
class SubArray
{

	static void printSubArray(int[] a, int start, int end)
	{
		
		if(end==a.length)
			return;
		else if(start>end)
			printSubArray(a, 0, end+1);
		else
		{
			System.out.print("[");
			for(int i=start; i<end; i++)
				System.out.print(a[i]+", ");
			System.out.println(a[end]+"]");
			printSubArray(a, start+1, end);
		}
		
	}

	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		Scanner in = new Scanner(System.in);
		printSubArray(arr, 0, 0);
	}
}