import java.util.Scanner;
class MaxPieceOfRod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.print(" Maximum possible cut is "+maxCut(n, a, b, c));
	}
	static int maxCut(int n, int a, int b, int c)
	{
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int res = Math.max(maxCut(n-a, a,b,c), Math.max(maxCut(n-b, a,b,c), maxCut(n-c, a,b,c)));
		if(res==-1)
			return -1;
		return res+1;
	}

}