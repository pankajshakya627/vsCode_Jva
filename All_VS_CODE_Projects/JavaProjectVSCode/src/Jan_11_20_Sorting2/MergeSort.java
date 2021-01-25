import java.util.Scanner;

public class MergeSort {

    static void merge(int[] a, int low, int mid, int high)
    {
        int n1 = mid-low+1;
        int n2 = high - mid; 
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0; i<n1; i++)
            left[i] = a[low+i];
        for(int j=0; j<n2; j++)
            right[j] = a[mid+1+j];
        int i=0, j=0, k=low;
        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j]){
                a[k]=left[i];
                i++;
                k++;
                // a[k++]=left[i++];
            }
            else{
                a[k]=right[j];
                k++;
                j++;
                // a[k++]=right[j++];
            }
        }
        while(i<n1)
        {
            a[k]=left[i];
            k++;
            i++;
            // a[k++]=left[i++];
        }
        while(j<n2)
        {
            a[k]=right[j];
            k++;
            j++;
            // a[k++]=right[j++];
        }
        
    }

    static void mergeSort(int[] a, int l, int r)
    {
        if(r>l)
        {
            int mid = l+(r-l)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);
            merge(a, l, mid, r);
        }
    
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close();       
        int l = 0;
        int r = n-1;
        mergeSort(a,l, r);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
                
    }
}
