import java.util.Scanner;

public class TrappingWaterNaive {

    static int getWater(int a[])
    {
        int n = a.length;
        int res =0;
        for(int i=0; i<n; i++)
        {
            int lMax = a[i];
            for(int j=0; j<i; j++)
                lMax = Math.max(lMax, a[j]);
            int rMax = a[i];
            for(int j=i+1; j<n; j++)
                rMax = Math.max(rMax, a[j]);
            res = res+(Math.min(lMax, rMax) - a[i]);
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
        System.out.println(getWater(a));
    }
    
}
