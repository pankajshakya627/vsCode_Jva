import java.util.Scanner;

public class StockBuySell {

static int maxProfit(int[] price)
{
    int n = price.length;
    int profit=0;
    for(int i=1; i<n; i++)
        if(price[i]>price[i-1])
            profit += (price[i]-price[i-1]);
    return profit;
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        s.close();
        System.out.println(maxProfit(a));
    }
    
}
