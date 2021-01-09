import java.util.Scanner;
public class RemoveDup
{
	public static void main(String[] args) 
	{
		int a[] = {2,9,7,5,3,2,3,4};
		int n = a.length;
		// remDuplicate(a,n);		
	}
	static void remDuplicate(int[] a,int n)
	{
		
		int[] res = new int[n];
		int pos = 0;
		for (int i=0; i<n; i++ ) 
		{
			for(int j=1; j<n; j++)
			{
				if(a[i]!=a[j])
				{
					res[pos] = a[j];
					pos++;
				}		
				else
				{
					break;
				}	
			}
		}
		for (int i=0; i<pos; i++ ) 
		{
			System.out.print(res[i]+" ");
		}
		// return res;
	}	
}