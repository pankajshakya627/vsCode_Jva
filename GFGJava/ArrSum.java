import java.util.Scanner;
public class ArrSum
{
	// Return array Sum
	public static int arraySum(int[] arr)
	{
		int size = arr.length;
		int sum =0;
		for(int i=0; i<size; i++)
		{
			sum += arr[i]; 
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		int res = arraySum(arr);
		System.out.print(res);
	}
	
}
