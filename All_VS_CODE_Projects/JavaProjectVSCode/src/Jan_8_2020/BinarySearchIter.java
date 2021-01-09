import java.util.Scanner;

public class BinarySearchIter
{
    public static int bimarySearchIter(int[] a, int x)
    {
        int n = a.length;
        int low =0;
        int high=n-1;
        int mid=(low+high/2);
        while(low<=high)
        {
            if(a[mid]==x)
                return mid;
            if(a[mid]>x)
            {
                high = mid-1; 
            }
            else if(a[mid]<x)
            {
                low = mid+1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int x = s.nextInt(); 
        s.close();
        System.out.println(bimarySearchIter(a,x));

    }
}