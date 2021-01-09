import java.util.Scanner;
class RotateArray
{
 
 	static void leftRotate(int[] arr, int x, int n)
 	{
 		//Temp array to store first x element of array
 		int[] t = new int[x];
 		for(int i=0; i<x; i++)
 		{
 			t[i] = arr[i];
 		}

 		// Array Element from index x to array_size
 		for(int i=x; i<n; i++)
 		{
 			arr[i-x] = arr[i];
 		}
 		// put back the value of temp arry into original array
 		for(int i=0; i<x; i++)
 		{
 			arr[n-x+i] = t[i];
 		}

 	}


	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		int n = arr.length;
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		leftRotate(arr,x,n);
		
		for(int i=0; i<n; i++)
 		{
 			System.out.print(arr[i]+" ");
 		}
		
	}
}