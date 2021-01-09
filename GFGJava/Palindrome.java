import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int start=0, end = str.length()-1;
        System.out.print(isPalindrome(str, start, end));
	}
	static boolean isPalindrome(String s, int start, int end)
	{		
		if(start>=end)
			return true;
		return (s.charAt(start)==s.charAt(end) && isPalindrome(s, start+1, end-1));
	}
}
