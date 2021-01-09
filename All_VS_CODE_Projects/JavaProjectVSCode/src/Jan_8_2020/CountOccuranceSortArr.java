import java.util.Scanner;

public class CountOccuranceSortArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        int x = s.nextInt();
        s.close();
        System.out.println(countOcc(a,n, x)); 
    }

    static int countOcc(int[] a, int n, int x)
    {
        int first = FirstOccur.firstOcc(a, n, x);
        if(first == -1)
            return 0;
        else
            return (LastOccur.lastOcc(a, n, x) - first + 1);
       
    }
    
}
