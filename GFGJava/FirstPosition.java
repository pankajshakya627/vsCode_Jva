 /*
  Question - For a given sorted array(ascending order) and a target number,
 find the first index of that number.

   */

class FirstPosition
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 10};
		int target = 6;
		System.out.println(firstPosOfTarget(arr, target));			
	}

	static int firstPosOfTarget(int[] nums, int target)
	{
		if(nums==null || nums.length==0)
			return -1;
		int left = 0;
		int right = nums.length-1;
		while(left+1<right)
		{
			int mid = left+(right-left)/2;
			if(nums[mid]<target)
				left = mid;
			else  // nums[mid] >= target
				right = mid;
		}
		if(nums[left]==target)
			return left;
		if(nums[right]==target)
			return right;
		return -1;
	}
}