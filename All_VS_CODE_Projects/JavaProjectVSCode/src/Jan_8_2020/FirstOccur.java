import java.util.Scanner;

public class FirstOccur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int x = s.nextInt();
        s.close();
        System.out.println(firstOcc(a, n, x)); 
    }
    static int firstOcc(int[] a, int n, int x)
    {
        int low =0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if (a[mid]>x)
                high = mid-1;
            else if(a[mid]<x)
                low = mid+1;
            else{
                if(mid==0||a[mid-1]!=a[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    
}
