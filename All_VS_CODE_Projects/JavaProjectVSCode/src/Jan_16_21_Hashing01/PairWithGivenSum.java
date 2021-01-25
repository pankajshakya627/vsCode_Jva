import java.util.HashSet;
import java.util.Scanner;
class PairWithGivenSum
{
	static boolean isPair(int[] arr, int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			if(s.contains(sum-arr[i]))
				return true;
			s.add(arr[i]);
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
        System.out.print(isPair(a, sum));
	}
}