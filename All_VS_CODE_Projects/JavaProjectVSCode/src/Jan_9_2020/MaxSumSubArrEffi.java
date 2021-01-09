import java.util.Scanner;
public class MaxSumSubArrEffi {

    static int maxSumSubArrEff(int[] a)
    {
        int n = a.length;
        int res = a[0];
        int maxEnding = a[0];
        for(int i=1; i<n; i++)
        {
            maxEnding = Math.max(maxEnding+a[i], a[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        s.close();
        System.out.println(maxSumSubArrEff(a));
    }
    
}
