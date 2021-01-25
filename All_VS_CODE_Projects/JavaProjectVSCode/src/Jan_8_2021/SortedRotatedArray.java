import java.util.Scanner;

public class SortedRotatedArray 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int x = s.nextInt();
        s.close();
        System.out.println(searchArray(a, n, x)); 

    }
    static int searchArray(int []a, int n, int x)
    {
        int low = 0, high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(a[mid]==x)
                return mid;
            if(a[low]<a[mid]){
                if(x>=a[low] && x<a[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else{
                if(x>a[mid] && x<=a[high])
                    low = mid+1;
                else    
                    high = mid-1;
            }
        }
        return -1;
    }     
    
}
