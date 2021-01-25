import java.util.Scanner;
class LongestComSpan
{
	static int longComSpan(int[] arr1, int[] arr2)
	{
		int res = 0;
		for(int i=0; i<arr1.length; i++)
		{
			int sum1 = 0, sum2 =0;
			for(int j=i; j<arr1.length; j++)
			{
				sum1 += arr1[j];
				sum2 += arr2[j];
				if(sum1==sum2)
					res = Math.max(res, j-i+1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 

        for(int i=0; i<n; i++)
            b[i] = s.nextInt();
        s.close(); 
        System.out.print(longComSpan(a,b));
	}

}
