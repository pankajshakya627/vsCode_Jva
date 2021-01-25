import java.util.Scanner;

public class RadixSort {

    static void radixSort(int[] arr)
    {
        int n = arr.length;
        int mx = arr[0];
        for(int i=0; i<n; i++)
            if(arr[i]>mx)
                mx = arr[i];
        for(int exp = 1; mx/exp >0; exp = exp*10)
            countingSort(arr,exp);
    }

    static void countingSort(int[] arr, int exp)
    {
        int n = arr.length;
        int[] count = new int[10];
        int[] output = new int[n];
        for(int i=0; i<10; i++)
            count[i] = 0;
        for(int i=0; i<n; i++)
            count[(arr[i]/exp)%10]++;
        for(int i=1; i<10; i++)
            count[i] = count[i]+count[i-1];
        for(int i=n-1; i>=0; i--)
        {
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0; i<n; i++)
            arr[i] = output[i];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();       
        int[] a = new int[n];        
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close();       
        radixSort(a);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    
}
