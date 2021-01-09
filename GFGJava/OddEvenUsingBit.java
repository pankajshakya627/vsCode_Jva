import java.util.Scanner;
class OddEvenUsingBit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(oddEven(a)==1)
			System.out.print("Odd");
		else
			System.out.print("Even");
	}
	static int oddEven(int n)
	{
		return n&1;
	}
}