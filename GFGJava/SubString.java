import java.util.Scanner;

class SubString
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String curr = "";
        int index=0;
        printStr(str, curr, index);
    }
    static void printStr(String s, String curr, int index)
    {
    	if(index==s.length())
    	{
    		System.out.print(curr);
    		return ;
    	}
    	printStr(s, curr, index+1);
    	printStr(s, curr+s[index], index+1);
    }
}