import java.util.Scanner;
class ZeroSumSubArray
{
	static boolean zeroSubArrN(int[] arr)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j=0; j<arr.length; j++)
			{
				sum += arr[j];
				if(sum==0)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        // int sum = s.nextInt();
        s.close(); 
        System.out.print(zeroSubArrN(a));
	}

}