import java.util.Scanner;

public class MatrixBoundruTraverse {

    static void bTraversal(int mat[][], int r, int c)
    {
        if(r==1)
            for(int i =0; i<c; i++)
                System.out.print(mat[0][i]+" ");
        if(c==1)
            for(int i=0; i<r; i++)
                    System.out.print(mat[i][0]+" ");         
        else            
        {
            for(int i=0; i<c; i++)
                System.out.print(mat[0][i]+" ");
            for(int i=1; i<r; i++)
                System.out.print(mat[i][c-1]+" ");
            for(int i=c-2; i>=0; i--)
                System.out.print(mat[r-1][i]+" ");
            for(int i=r-2; i>=1; i--)
                System.out.print(mat[i][0]+" ");
        }
    } 


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                mat[i][j] = in.nextInt();
        in.close();
        bTraversal(mat, r, c);
    }
}
