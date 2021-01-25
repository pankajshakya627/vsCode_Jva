import java.util.Scanner;

public class SnakePattern {

    static void printSnake(int mat[][])
    {
        for(int i=0; i<mat.length; i++)
        {
            if(i%2==0)
            {
                for(int j = 0; j<mat[i].length; j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else
            {
                for(int j = mat[i].length-1; j>=0; j--)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
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
        printSnake(mat);
    }
}
