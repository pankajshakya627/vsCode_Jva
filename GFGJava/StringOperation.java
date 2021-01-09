import java.util.Scanner;

public class StringOperation
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();
        System.out.println(str.substring(3));
    }
}

