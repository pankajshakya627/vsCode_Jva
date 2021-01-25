import java.util.Scanner;
class LongestSubArrWithSum
{
	static int longSubArrWithSumN(int[] arr, int sum)
	{
		int res=0;		
		for(int i=0; i<arr.length; i++)
		{
			int curr_sum = 0;
			for(int j=i; j<arr.length; j++)
			{
				curr_sum += arr[j];
				if(curr_sum==sum)
					res = Math.max(res, j-i+1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        int sum = s.nextInt();
        s.close(); 
        System.out.print(longSubArrWithSumN(a, sum));
	}

}