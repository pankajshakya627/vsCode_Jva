import java.util.Scanner;

public class TwoDArrayAsArg {
    public static void print(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j]+" ");
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
        print(mat);
    }
}
