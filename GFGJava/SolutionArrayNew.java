import java.util.Scanner;
import java.util.*;
public class SolutionArrayNew
{
	public static void main(String[] args) 
	{
		int[] arr1 = {1,3,7};
		int[] arr2 = {2,3,4,6,8};

		int len1 = arr1.length;		
		int len2 = arr2.length;
		int totLen = len1+len2;
		int pos=0;
		int[] res = new int[totLen];

		for(int i=0; i<len1; i++)
		{
			res[i] = arr1[i];
			pos++;

		} 
		
		for(int i=0;i<len2;i++)
		{
			int t=0;
			for(int j=0;j<len1;j++)
			{
				if(arr2[i]==arr1[j])
				{
					t++;
					break;
				}
			}
			if(t==0)
				{
					res[pos]=arr2[i];
					pos++;
				}
		}
		
		for(int i=0; i<pos; i++)
		{
			System.out.print(res[i]+" ");
		}
		
		System.out.println();
		int temp[] = new int[pos];
		for(int i=0; i<pos; i++)
		{
			temp [i] = res[i];
		}
		Arrays.sort(temp);
		System.out.println("-----------------");
		for(int i=0; i<pos; i++)
		{
			System.out.print(temp[i]+" ");
		}

	}

}