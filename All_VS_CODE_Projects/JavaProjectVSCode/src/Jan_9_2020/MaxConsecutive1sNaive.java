import java.util.Scanner;

public class MaxConsecutive1sNaive {

    static int maxConsecutive(int[] a)
    {
        int n = a.length;
        int res = 0;
        for(int i=0; i<n; i++)
        {
            int curr=0;
            for(int j=i; j<n; j++)
            {
                if(a[j]==1)
                    curr++;
                else
                    break;
            }
            res = Math.max(curr, res);
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
        System.out.println(maxConsecutive(a));
    }
    
}
