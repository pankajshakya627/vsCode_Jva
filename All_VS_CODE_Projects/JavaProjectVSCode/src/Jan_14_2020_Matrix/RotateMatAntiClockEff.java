import java.util.Scanner;

public class RotateMatAntiClockEff {
    static void rotateMat90(int mat[][], int n)
    {
        // 1. Find Transpose
        // 2. Reverse individual column
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) {
                int t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;   
            }            
        }
        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = n-1;
            while(low<high)
            {
                int t = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = t;
                low++;
                high--;
            }            
        }
        System.out.println("-------------");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                mat[i][j] = in.nextInt();
        in.close();
    rotateMat90(mat, n);
    }
}
