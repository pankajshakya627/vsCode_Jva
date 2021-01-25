import java.util.Scanner;
class SubSArr0s1sN
{

	static int logestSub01(int[] arr)
	{
		int res=0;
		for (int i=0; i<arr.length; i++) 
		{
			int c0=0, c1=0;
			for(int j=i; j<arr.length; j++)
			{
				if(arr[j]==0)
					c0++;
				else 
					c1++;
				if(c0==c1)
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
        s.close(); 
        System.out.print(logestSub01(a));
	}
		
}