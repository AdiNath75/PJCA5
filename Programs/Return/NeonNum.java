import java.util.Scanner;
class  NeonNum
{
	public static boolean neon(int num)
	{
		int square = num*num;
		int neon = sum(square);
		if (num == neon)
		{
			return true;
		}
		return false;
	}
	public static int sum(int num)
	{
		int sum = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum+rem;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = s.nextInt();
		boolean ans = neon(num);
		if (ans == true)
		{
			System.out.println("It is Neon Number");
		}
		else 
			System.out.println("It is Not Neon Number");
	}
}
