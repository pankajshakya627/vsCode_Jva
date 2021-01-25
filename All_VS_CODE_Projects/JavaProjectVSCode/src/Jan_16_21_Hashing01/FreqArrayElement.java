import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqArrayElement {

    static void countFreq(int[] arr)
    {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int x : arr) 
            h.put(x, h.getOrDefault(x, 0)+1);
        for(Map.Entry<Integer, Integer> e: h.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        s.close(); 
        countFreq(a); 
     }

    
}
