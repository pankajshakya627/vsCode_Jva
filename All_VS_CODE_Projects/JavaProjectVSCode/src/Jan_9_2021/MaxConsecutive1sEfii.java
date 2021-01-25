import java.util.Scanner;

public class MaxConsecutive1sEfii {

    static int maxConsecutiveEff(int[] a)
    {
        int n = a.length;
        int res=0, curr=0;
        for(int i=0; i<n; i++)
        {
            if(a[i]==0)
                curr = 0;
            else{
                curr++;
                res = Math.max(curr, res);
            }
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
        System.out.println(maxConsecutiveEff(a));
    }
    
}
