import java.util.Scanner;
class IthBit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(getBit(a,x));
		System.out.println(setBit(a,x));

	}
	// find if bit is set or not
	static int getBit(int n, int x)
	{
		int mask = (1<<x);
		int bit = (n&mask)>0 ? 1:0;
		return bit;

	}

	// Set ith Bit
	static int setBit(int n, int x)
	{
		int mask = (1<<x);
		int ans = n | mask;
		return ans;
	}
}