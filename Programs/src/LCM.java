import java.util.Scanner;
class  LCM
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = s.nextInt();
		System.out.println("Enter Second Number");
		int b = s.nextInt();
		int lcm = a>b?a:b;
		for (; ; )
		{
			if (lcm%a==0 && lcm%b==0)
			{
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}
}
