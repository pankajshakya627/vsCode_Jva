import java.util.Scanner;

public class PatterProg 
{
    public static void main(String[] args) 
    {
        Scanner sx = new Scanner(System.in);
        int n = sx.nextInt();
        sx.close();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\n\n------- next Pattern -----\n\n");

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("  ");
            }               

            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            } 
            System.out.println();
        }

        System.out.println("\n\n------- next Pattern -----\n\n");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
                System.out.print("* ");
            System.out.println();
        }



        System.out.println("\n\n------- next Pattern -----\n\n");

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i-1; j++)
            {
                System.out.print("  ");
            }               

            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print("* ");
            } 
            System.out.println();
        }


        
    }
    
}
