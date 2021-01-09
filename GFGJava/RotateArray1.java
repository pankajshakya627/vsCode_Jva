import java.util.Scanner;
class RotateArray1
{
 
 	static void singleleftRotate(int[] arr, int low, int high)
 	{
 		while(low<=high)
 		{
 		int t=arr[low];
 		arr[low]=arr[high];
 		arr[high]=t;
 		low++;
 		high--;
 		}

 	}


	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		int n = arr.length;
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		singleleftRotate(arr,0,x-1);
		singleleftRotate(arr,x,n-1);
		singleleftRotate(arr,0,n-1);
		
		for(int i=0; i<n; i++)
 		{
 			System.out.print(arr[i]+" ");
 		}
		
	}
}