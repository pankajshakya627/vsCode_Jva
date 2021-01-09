import java.util.Scanner;

class Fib
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for(int i=1; i<=a; i++)
            System.out.print(fib(i)+"  ");
    }
    static int fib(int n)
    {
        if(n<=1)
            return n;
        // if(n==0)
        //     return 0;
        // if(n==1)
        //     return 1;
        return fib(n-1)+fib(n-2);
            

    }
}
