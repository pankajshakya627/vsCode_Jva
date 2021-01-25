import java.util.Scanner;

public class CountingSortNaive {
 
    // Counting Sort algo is not a comparison based algo it
    // count the the number of occurance
    static void countSortN(int[] arr, int k)
    {
        int[] count = new int[k];
        for(int i=0; i<k; i++)
            count[i] = 0;
        for(int i=0; i<arr.length; i++)
            count[arr[i]]++;
        int index = 0;
        for(int i=0; i<k; i++)
        {
            for(int j=0; j<count[i]; j++)
            {
                arr[index] = i;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       
        int[] a = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        
        int k = s.nextInt();
        s.close();       
        countSortN(a, k);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    
}
