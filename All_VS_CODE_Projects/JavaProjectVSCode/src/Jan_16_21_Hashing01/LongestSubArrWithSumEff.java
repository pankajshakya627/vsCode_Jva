import java.util.Scanner;
import java.util.HashMap;
class LongestSubArrWithSumEff
{
	static int longSubArrWithSum(int[] arr, int sum)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int res=0;
		int pre_Sum=0;
		for(int i=0; i<arr.length; i++)
		{
			pre_Sum += arr[i];
			if(pre_Sum==sum)
				res = i+1;
			if(hm.containsValue(pre_Sum)==false)
			{
				hm.put(pre_Sum,i);
			}
			if(hm.containsValue(pre_Sum-sum))
				res = Math.max(res, i-hm.get(pre_Sum-sum));
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
        System.out.print(longSubArrWithSum(a, sum));
	}

}