import java.util.Scanner;

public class IntersectionNaive {
    static void intersectionN(int[] a, int[] b, int n, int m)
    {
        for(int i=0; i<n; i++)
        {
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0; j<m; j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt(); 
        int m = s.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++)
            b[i] = s.nextInt(); 
        s.close(); 
        intersectionN(a, b, n, m);
    }
    
}
