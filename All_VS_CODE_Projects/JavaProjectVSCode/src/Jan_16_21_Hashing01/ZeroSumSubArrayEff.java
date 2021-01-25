import java.util.Scanner;
import java.util.HashSet;
class ZeroSumSubArrayEff
{
	static boolean zeroSubArrE(int[] arr)
	{
		HashSet<Integer> h = new HashSet<>();
		int pre_Sum=0;
		for(int i=0; i<arr.length; i++)
		{
			pre_Sum += arr[i];
			if(h.contains(pre_Sum))
				return true;
			if(pre_Sum==0)
				return true;
			h.add(pre_Sum);
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close(); 
        System.out.print(zeroSubArrE(a));
	}

}