import java.util.Scanner;
class XylemPholem 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int es =0, ms=0;
		int r=n%10;
		es = es+r;
		n=n/10;
		while (n>9)
		{
			r = n%10;
			ms = ms+r;
			n=n/10;
		}
		es =es+n;
		if (es==ms)
			System.out.println("Xylem");
		else
			System.out.println("Pholem");
	}
}
