import java.util.Scanner;
class  StrongRange
{
	public static void strong(int start, int end)
	{
		for (int i = start;i<end ;i++ )
		{
			int ans = sum(i);
			if (ans == i)
			{
				System.out.println(i);
			}
		}
	}
	public static int sum(int num)
	{
		int sum = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum+fact(rem);
		}
		return sum;
	}
	public static int fact(int num)
	{
		int fact= 1;
		for (int i=num;i>0 ;i-- )
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start = s.nextInt();
		System.out.println("Enter ending Number");
		int end = s.nextInt();
		strong(start, end);
	}
}
