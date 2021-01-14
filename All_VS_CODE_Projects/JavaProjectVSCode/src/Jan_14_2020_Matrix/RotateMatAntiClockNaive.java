import java.util.Scanner;

public class RotateMatAntiClockNaive {
    static void rotate90(int mat[][], int n)
    {
        int temp[][] = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                temp[n-j-1][i] = mat[i][j];   
            }           
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                mat[i][j] = temp[i][j];
            }
        }
        System.out.println("---------------");
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
        rotate90(mat, n);
    }
}
