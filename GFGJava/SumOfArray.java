import java.util.*;
import java.lang.*;
import java.io.*;

public class SumOfArray {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		while(T!=0)
		{
		    int n = s.nextInt();
		    int[] a = new int[n-1];
		    for(int i=0; i<a.length; i++)
		    {
		        a[i]=s.nextInt();
		    }
		    // SumArray m = new SumArray();
		    System.out.println("\n\n------------------------------\n");
		    System.out.println(sumArr(a));
		    T--;
		    
		}
	}

	static int sumArr(int a[])
    {
        int res=0;
        for(int i=0; i<=a.length; i++)
        {
            res += a[i];
        }
        return res;
    }
}

    

 