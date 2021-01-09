// import java.util.ArrayList;
import java.util.Scanner;
public class MajorityElement
{
	public static void main(String[] args) 
	{
		// int[] arr = {2,2,3,1,2,3,2,1,1};
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		int[] arr = new int[len];
		for(int i=0; i<len; i++)
			arr[i]=sc.nextInt();
			sc.close();
		System.out.println();
		for(int i=0; i<len; i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n\n--------------------------\n");
		System.out.print(majorityElement(arr));
	}


	static int majorityElement(int[] a)
	{
		int n = a.length-1;
		int x=0; 
		int count=0;
		for(int i=0; i<=n; i++)
		{
			// int curr=a[i];
			for(int j=1; j<=n; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
			}
			if(count > n/2)
			{
					x=i;
					break;
			}
		}
		// System.out.print(a[x]);
		return a[x];
	}	
}