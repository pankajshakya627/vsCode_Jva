
There is som error in the following code

// import java.util.Scanner;
// public class EqualSumPart
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++)
//         	arr[i] = sc.nextInt();
//         int sum = sc.nextInt();
//         System.out.println(equalSumPart(arr,sum));	

//         // System.out.println();
//         // System.out.print(subsetSum(arr, sum));	
// 	}

// 	static boolean equalSumPart(int[] arr, int sum)
// 	{
// 		int arrSum = 0;
// 		for(int i=0; i<arr.length; i++)
// 		{
// 			 arrSum = arrSum + arr[i];
// 		}

// 		if(arrSum%2!=0)
// 			return false;
// 		else if(arrSum%2==0)
// 			return subsetSum(arr, arrSum/2);
// 		return false;
// 	}


// 	static boolean subsetSum(int[] arr, int sum)
// 	{
// 		boolean[][] t = new boolean[arr.length+1][sum+1];
// 		for (int i=0; i<=arr.length; i++)
// 			for (int j=0;j<=sum; j++) 
// 			{
// 				if(i==0)
//                     t[i][j] = false;
//                 if(j==0)
//                     t[i][j] = true;
// 			}

// 		for (int i=1; i<=arr.length; i++)
// 			for (int j=1;j<=sum; j++)
// 			{
// 				if(arr[i-1]<=j)
// 					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
// 				else
// 					t[i][j] = t[i-1][j];
// 			} 
// 			return t[arr.length][sum];
// 	}
// }