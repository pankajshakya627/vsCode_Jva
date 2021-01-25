import java.util.HashSet;
import java.util.Scanner;
class PairWithGivenSumNaive
{
	static boolean isPairN(int[] arr, int sum)
	{
	
		for(int i=0; i<arr.length; i++)
			for(int j=i+1;  j <arr.length; j++)
				if(arr[i]+arr[j]==sum)
					return true;
		
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
        System.out.print(isPairN(a, sum));
	}
}