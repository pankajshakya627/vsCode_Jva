import java.util.Scanner;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int x = s.nextInt();
        s.close();
        System.out.println(searchInfiniteArr(a,x));
    }

    static int searchInfiniteArr(int[] a, int x)
    {
        if(a[0]==x) 
            return 0;
        int i=1;
        while(a[i]<x)
            i=i*2;
        if(a[i]==x)
            return i;
        return BinarySearchIter(a, x, ((i/2)+1), (i-1));
    }

    private static int BinarySearchIter(int[] a, int x, int low, int high) 
    {          
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


}
