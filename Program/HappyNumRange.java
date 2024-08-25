import java.util.Scanner;
class HappyNumRange
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number");
		int start = s.nextInt();
		System.out.println("Enter Second number");
		int end = s.nextInt();
		for (int i=start;i<=end ;i++ )
		{
			boolean ans = happyNum(i);
			if (ans == true)
			{
				System.out.println(i);
			}
		}
	}
	public static boolean happyNum(int n)
	{
		while (n>10)
		{
			int sum =0;
			do
			{
				int d=n%10;
				sum =sum+d*d;
				n=n/10;
			}while (n!=0);
			n=sum;
		}
		if (n==1 || n==7)
			return true;
		else
			return false;
	}
}
