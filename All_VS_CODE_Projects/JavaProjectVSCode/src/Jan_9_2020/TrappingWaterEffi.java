import java.util.Scanner;

public class TrappingWaterEffi {

    static int trapppingWater(int[] a)
    {
        int n = a.length;
        int res = 0;
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        lMax[0] = a[0];
        for(int i=1; i<n; i++)
            lMax[i] = Math.max(a[i], lMax[i-1]);
            
        rMax[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--)
            rMax[i] = Math.max(a[i], rMax[i+1]);
        for(int i=0; i<n; i++)
            res += Math.min(lMax[i], rMax[i])-a[i];

        return res;
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        s.close();
        System.out.println(trapppingWater(a));
    }
    
}
