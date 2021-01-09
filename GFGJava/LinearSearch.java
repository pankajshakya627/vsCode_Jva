import java.util.Scanner;
class LinearSearch
{
	static int linearSearch(int[] arr, int target)
	{
		int ans = -1;
		int size = arr.length;
		for(int i=0; i<size; i++)
		{
			if(arr[i]==target)
			{
				ans = i;
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++)
			arr[i]=in.nextInt();
		int x = in.nextInt();
		int res = linearSearch(arr, x);
		System.out.print("Index of target "+res);
		
	}
}