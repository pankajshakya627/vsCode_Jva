import java.util.Scanner;
class PushZeroBack
{

	public static void pushZero(int[] arr)
	{
		int size = arr.length;
		

		// // Naive approach

		// for(int i=0; i<size; i++)
		// {
		// 	if(arr[i]==0)
		// 	{
		// 		for(int j=i+1; j<size; j++)
		// 		{
		// 			if(arr[j]!=0)
		// 			{
		// 				int t = arr[i];
		// 				arr[i] = arr[j];
		// 				arr[j] = t;
		// 			}
		// 		}
		// 	}
		// }

		// Efficient Approach

		int c=0;
		for(int i=0; i<size; i++)
		{
			if(arr[i]!=0)
			{
				int t = arr[c];
				arr[c] = arr[i];
				arr[i] = t;
				c++;

			}
		}

		// print Array
		for (int i=0;i<size; i++ ) 
		{
			System.out.print(arr[i]+" ");			
		}
	}

	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		pushZero(arr);
		
	}
}