import java.util.Scanner;
class SolveString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		valRet(str);
	}
	static void valRet(String s)
	{
		int len = s.length();
		char ch = 'a';
		int castAscii=0;
		for(int i=0; i<len; i++)
		{
			ch = s.charAt(i);
			if(ch <= 'a'  && ch >='z' )
			{
				castAscii  = ch-96;
				
			}
			System.out.print(castAscii);
		}
		
		// for (int i=0; i<len; i++ ) 
		// {
		// 	System.out.print(s.charAt(i));
		// }
	}
}