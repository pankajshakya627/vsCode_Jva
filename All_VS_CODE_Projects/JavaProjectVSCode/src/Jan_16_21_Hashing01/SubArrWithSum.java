import java.util.Scanner;
class SubArrWithSum
{
	static boolean subArrWithSumN(int[] arr, int sum)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			int curr_sum = 0;
			for(int j=i; j<arr.length; j++)
			{
				curr_sum += arr[j];
				if(curr_sum==sum)
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
        int sum = s.nextInt();
        s.close(); 
        System.out.print(subArrWithSumN(a, sum));
	}

}