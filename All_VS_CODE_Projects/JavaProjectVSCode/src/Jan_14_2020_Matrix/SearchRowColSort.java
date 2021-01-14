import java.util.Scanner;

public class SearchRowColSort {

    static void serachRowColSortedArr(int mat[][], int r, int c, int x)
    {
        int i= 0, j=c-1;
        while(i<r && j >=0)
        {
            if(mat[i][j]==x)
            {
                System.out.print("Found at ("+i+","+j+")");
                return;
            }
            else if(mat[i][j]>x)
                j--;
            else
                i++;
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                mat[i][j] = in.nextInt();
        int x = in.nextInt();
        in.close();
        System.out.println("-----------");
        serachRowColSortedArr(mat, r, c, x);
    }
    
}
