import java.util.Arrays;
import java.util.Scanner;

public class MeadianOfRowWiseSortMat {

    static int matMedian(int[][] mat, int r, int c)
    {
        int min = mat[0][0], max = mat[0][c-1];
        for(int i=1; i<r; i++)
        {
            if(mat[i][0]< min);
                min = mat[i][0];
            if(mat[i][c-1] > max);
                max = mat[i][c-1];
        }
        
        int medPos = (r*c+1)/2;
        while(min<max)
        {
            int mid = (min+max)/2, midPos = 0;
            for(int i=0; i<r; i++)
            {
                int pos = Arrays.binarySearch(mat[i], mid)+1;
                midPos += Math.abs(pos); 
            }
            if(midPos<medPos)
                min = mid+1;
            else
                max = mid;
        }
        return min;
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
        System.out.print("Medain -> ");
        System.out.println(matMedian(mat, r, c));
    }
    
}
