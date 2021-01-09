import java.util.Scanner;

public class SquareRootNaive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println(rootSquare(x));
        
    }
    static int rootSquare(int x)
    {
        int i =1;
        while(i*i<=x)
            i++;
        return i-1;
    }
    
}
