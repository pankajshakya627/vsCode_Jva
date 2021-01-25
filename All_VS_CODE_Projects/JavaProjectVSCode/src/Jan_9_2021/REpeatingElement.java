import java.util.Scanner;

public class REpeatingElement {

    static int repeatingElement(int[] arr)
    {
        int n = arr.length;
        boolean visited[] = new boolean[n-1];
        for(int i=0; i<n-1; i++)
            visited[i] = false;
        for(int i=0; i<n; i++)
        {
            if(visited[arr[i]])
            {
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();
        s.close();
        System.out.println(repeatingElement(a));
        
    }
    
}
