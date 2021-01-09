import java.util.Scanner;
class SwapAlternate
{

	public static void swapAlternate(int[] arr)
	{
		int size = arr.length;
		if(size%2==0)
		{
			for(int i=0; i<size; i++)
			{
				if(i%2==0)
				{
					int t = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = t;
				}
			}
		}
		else
		{
			for(int i=0; i<size; i++)
			{
				if(i%2==1)
				{
					int t = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = t;
				}
			}
		}
		
		for (int i=0;i<size; i++ ) 
		{
			System.out.print(arr[i]+" ");
			
		}
	}


	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		swapAlternate(arr);
		
	}
}
