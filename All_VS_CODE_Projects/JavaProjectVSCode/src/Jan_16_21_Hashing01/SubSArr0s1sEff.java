import java.util.Scanner;
import java.util.HashMap;
class SubSArr0s1sEff
{

	static int logestSub01(int[] arr)
	{
		HashMap<Integer, Integer> h = new HashMap<Integer,Integer>();
		int sum=0,res=0;
		for (int i=0; i<arr.length; i++) 
		{
			if(arr[i]==0)
				arr[i]=-1;
			else 
				continue;
		}

		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
			if(sum==0)
				res = i+1;
			if(h.containsKey(sum+arr.length))
			{
				if(res < i-h.get(sum+arr.length))
					res = i- h.get(sum+arr.length);
			}
			else
				h.put(sum+arr.length, i);			
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