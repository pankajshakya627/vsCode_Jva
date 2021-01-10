import java.util.Arrays;
import java.util.Scanner;

public class MergeSort2SortedArrayNaive {

    static void mergeSortedArray(int[] a, int[] b)
    {
        int m = a.length;
        int n = b.length;
        int[] c = new int[n+m];
        for(int i=0; i<m; i++)
            c[i] = a[i];
        for(int i=0; i<n; i++)
            c[i+m] = b[i];
        Arrays.sort(c);
        for(int i=0; i<n+m; i++)
            System.out.print(c[i]+" ");

    }    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        
        int a[] = new int[m];
        for(int i=0; i<m; i++)
            a[i] = s.nextInt();

        int n = s.nextInt();
        int b[] = new int[n];
        for(int i=0; i<n; i++)
            b[i] = s.nextInt();
        s.close();
        mergeSortedArray(a,b);
    }
}
