import java.util.Scanner;

public class TransposeOfMat {

    static void transpose(int mat[][])
    {
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = i+1; j < mat.length; j++) 
            {
                int t=mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;   
            }   
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
        transpose(mat);
        System.out.println("------------");
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = 0; j < mat[i].length; j++) 
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
