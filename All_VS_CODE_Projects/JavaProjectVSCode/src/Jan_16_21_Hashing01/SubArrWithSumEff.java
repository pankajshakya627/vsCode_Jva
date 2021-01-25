import java.util.Scanner;
import java.util.HashSet;
class SubArrWithSumEff
{
	static boolean subArrWithSum(int[] arr,int sum)
	{
		HashSet<Integer> s = new HashSet<>();
		int pre_Sum=0;
		for(int i=0; i<arr.length; i++)
		{ 
			pre_Sum += arr[i];
			if(pre_Sum == sum)
				return true;
			if(s.contains(pre_Sum-sum))
				return true;
			s.add(pre_Sum);
			
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
        System.out.print(subArrWithSum(a, sum));
	}

}