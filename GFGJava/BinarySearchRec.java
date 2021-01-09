class BinarySearchRec
{
	public static void main(String[] args) 
	{
		int[] arr = {2,4,7,7,9,11,14,19,22,33}; //{1,1};
		int target = 7; //1;
		// int start = 0;
		// int end = arr.length-1;
		// System.out.print("Index of target "+binSearchRecursive(arr, target, start, end));
		System.out.print(binarySearch(arr, target));
		
	}

	/*
	Recursive approach for Binary Search

	static int binSearchRecursive(int[] a, int target, int s, int e)
	{
		if(a==null || a.length==0)
			return -1;
		if(s>e)
			return -1;
		int mid = s+(e-s)/2; // To resove the overflow Problem (if e+s exceed the range of Integer)
		if(a[mid]==target)
			return mid;
		if(a[mid]<target)
			return binSearchRecursive(a, target, mid+1, e);
		
		return binSearchRecursive(a, target, s, mid-1);
	}
	*/

	// Better Approach for Binary Search REcursive

	static int binarySearch(int[] nums, int target)
	{
		if(nums==null || nums.length ==0)
			return -1;
		int left = 0;
		int right = nums.length-1;
		while(left+1<right)
		{
			int mid = left+(right-left)/2;
			if(nums[mid]<target)
				left = mid;
			else
				right = mid;
		}

		if(nums[left]==target)
			return left;
		if(nums[right]==target)
			return right;
		return -1;	
	}
}

