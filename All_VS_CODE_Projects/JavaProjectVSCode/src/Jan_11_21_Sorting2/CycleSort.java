import java.util.Scanner;
public class CycleSort {


    // This Function work for distinct element of array
    static void cycleSort(int[] arr)
    {
        for(int cs=0; cs<arr.length; cs++)
        {
            int item = arr[cs];
            int pos = cs;
            for(int i=cs+1; i<arr.length; i++)
            {
                if(arr[i]<item)
                    pos++;
            }
            int t = item;
            item = arr[pos];
            arr[pos]= t;
            while (pos!=cs) 
            {
                pos = cs;
                for(int i=cs+1; i<arr.length; i++)   
                {
                    if(arr[i]<item)
                        pos++;
                }
                int tt = item;
                item = arr[pos];
                arr[pos]= tt;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close();       
        cycleSort(a);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
    
}
