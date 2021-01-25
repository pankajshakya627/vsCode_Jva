import java.util.Scanner;

public class HeapSort {

    static void maxHeapify(int[] arr, int n, int i)
    {
        // n= arr.length
        int largest = i;
        int left = 2*i+1, right = 2*i+2;
        if(left < n && arr[left] > arr[largest])
            largest = left;
        if(right < n && arr[right] > arr[largest])
            largest = right;
        if(largest!=i)
        {
            int t = arr[largest];
            arr[largest] = arr[i];
            arr[i] = t;
            maxHeapify(arr, n,largest);
        }        
    }
    static void buildHeap(int[] arr, int n)
    {
        for(int i=(n-2)/2; i>=0; i--)
            maxHeapify(arr, n, i);
    }

    static void heapSort(int[] arr, int n)
    {
        buildHeap(arr, n);
        for (int i = arr.length-1 ; i >=1 ; i--) 
        {
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            maxHeapify(arr,i,0);
            
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close();       
        heapSort(a, n);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    
}
