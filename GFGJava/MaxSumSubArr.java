class MaxSumSubArr
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		System.out.print(maxSum(arr, k));	
	}

	static int maxSum(int[] a, int k)
	{
		int n = a.length;

		int m_Sum = 0;
		int winSum = 0;
		for(int i=0; i<n-k+1; i++)
		{
			winSum = 0;
			for(int j=i; j<i+k; j++)
			{
				winSum += a[j];
			}
			m_Sum = Math.max(m_Sum, winSum);
		}
		return m_Sum;
	}
}