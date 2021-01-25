import java.util.HashSet;
import java.util.Scanner;

public class CountDistEle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close(); 
        System.out.println((countDistinctElement(a)));
       
    }
    static int countDistinctElement(int[] arr)
    {
        HashSet<Integer> s= new HashSet<>();
        for(int i=0; i<arr.length; i++)
            s.add(arr[i]);
        return s.size();
    }
    
}
