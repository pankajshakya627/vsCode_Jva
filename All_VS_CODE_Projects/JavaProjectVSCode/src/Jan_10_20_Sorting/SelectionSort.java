import java.util.Scanner;

// Inpalce but not stable
// O(n^2)
public class SelectionSort {

    static void selectionSort(int[] a)
    {
        int n = a.length;
        for(int i=0; i<n-1; i++)
        {
            int min_idx = i;
            for(int j=i+1; j<n; j++)
                if(a[j]<a[min_idx])
                    min_idx = j;
            // swap(a[min_idx], a[i]);
            int t = a[min_idx];
            a[min_idx] = a[i];
            a[i] = t;
        }
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }
        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        s.close();
        selectionSort(a);

    }
    
}
