import java.util.Scanner;
class Mock1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		tenVal(num);
		hundreadVal(num);
		
	}
	public static int revNum(int num)
	{
		int rev = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			rev = rev*10+rem;
		}
		return rev;
	}
	public static void tenVal(int num)
	{
		int val = 0;
		for (int i=1;i<=2 ;i++ )
		{
			int rem = num%10;
			val = val*10+rem;
			num/=10;
		}
		int ans = revNum(val);
		char c = (char) (ans);
		System.out.println(c);
	}
	public static void hundreadVal(int num)
	{
		int val = 0;
		for (int i=1;i<=3 ; i++)
		{
			int rem = num%10;
			val = val*10+rem;
			num/=10;
		}
		int ans = revNum(val);
		if (ans>=100 && ans<=127)
		{
			char c1 = (char) (ans);
			System.out.println(c1);

		}
		else
		{
			System.out.println("No Character is Available");
		}
	}

}
