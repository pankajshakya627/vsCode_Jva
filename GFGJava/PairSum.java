import java.util.*;
public class PairSum
{
    public static void main(String[] args)
    {
        int arr[] = {9,4,2,3,1,6};
        int t = 10;
        pairSum(arr,t);
    }
    static void pairSum(int[] a, int target)
    {
        int right = a.length-1;
        int left =0;
        int c_sum =0;
        
        while(left<right)
        {
            c_sum = a[left]+a[right];
            if(c_sum==target)
            {
                System.out.println(left+" "+right);
                return;
            }
            if(target<c_sum)
                left++;
            else
                right--;
        }
        return ;
    }
    
}