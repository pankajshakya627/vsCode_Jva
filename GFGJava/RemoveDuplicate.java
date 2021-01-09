// import java.util.*;
// public class RemoveDuplicate
// {
// 	public static void main(String[] args) 
// 	{
// 		int[] arr = {2,3,3,4,5,5,5,6,};
// 		System.out.println("\n\n"+removeDuple(arr));
// 	}
// 	static int removeDuple(int[] a)
// 	{
// 		Arrays.sort(a);
// 		int n= a.length;
// 		int res = 1;
// 		int i=1;
// 		System.out.print(a[0]+" ");
// 		while(i<n-1)
// 		{
// 			if(a[res-1]!=a[i])
// 			{
// 				a[res] = a[i];
// 				System.out.print(a[res]+" ");
// 				res++;
// 			}
// 			i++;
// 		}
// 		return res;
// 	}
}