import java.util.Scanner;

public class SpiralMatrix {

    static void spiralMat(int[][] mat, int r, int c)
    {
        int top = 0, left =0, bottom = r-1, right = c-1;   
        while (top<=bottom && left <=right) 
        {
            for (int i = left; i <= right; i++) 
                System.out.print(mat[top][i]+" ");  
            top++;
            for(int i=top; i<=bottom; i++)
                System.out.print(mat[i][right]+" ");
            right--;
            if(top<=bottom)
            {
                for(int i=right; i>=left; i--)
                    System.out.print(mat[bottom][i]+" ");
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                    System.out.print(mat[i][left]+" ");
                left++;
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
        System.out.println("-----------");
        spiralMat(mat, r, c);
    }
    
}
