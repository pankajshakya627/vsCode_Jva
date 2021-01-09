import java.util.Scanner;
class CheckPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(isPrime(num));
	}

	static boolean isPrime(int n)
	{
		int rev=0, temp=n;
		while(temp!=0)
		{
			int ld = temp%10;
			rev = rev*10+ld;
			temp = temp/10;
		}
		return (rev==n);
	}
}