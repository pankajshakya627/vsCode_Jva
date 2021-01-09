import java.util.Scanner;
public class LargestInArray
{

	public static int largestElement(int arr[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
		return largest;
	}

	public static int[] takeInput()
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
			arr[i]=in.nextInt();
		return arr;
	}

	public static void printInput(int[] arr)
	{
		int size = arr.length;
		for (int i=0; i<size; i++ ) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) 
	{
		int input[] = takeInput();
		printInput(input);
		int largest = largestElement(input);
		System.out.print(largest);
	}
}