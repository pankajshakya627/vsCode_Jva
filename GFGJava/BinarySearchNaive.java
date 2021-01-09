import java.util.Scanner;
class BinarySearchNaive
{
	static int binarySearch(int[] a, int x)
	{
		int n = a.length;
		int s = 0;
		int e = n-1;
		if(a.length==0 || a==null)
			return -1;
		while(s+1<e)
		{
			int mid = e+(s-e)/2;
			if(a[mid] > x)
				e = mid;		
			else
				s = mid;
		}
		if(a[s]==x)
			return s;
		else if(a[e]==x)
			return e;
		return -1;
	}

	public static void main(String[] args) 
	{
		LargestInArray ob = new LargestInArray();
		int arr[] = ob.takeInput();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.print(binarySearch(arr,x));
	}
}