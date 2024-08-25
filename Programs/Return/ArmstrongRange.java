import java.util.Scanner;
class  ArmstrongRange
{
	public static void sum(int num)
	{
		int sum = 0;
		int count = count(num);
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum + pow(rem, count);
			if (sum==num)
				System.out.print(sum+" ");
		}
	}
	public static int count(int num)
	{
		int count = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			count++;
		}
		return count;
	}
	public static int pow(int num, int p)
	{
		int pow = 1;
		for (int i=p;i>0 ;i-- )
		{
			pow = pow*num;
		}
		return pow;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start = s.nextInt();
		System.out.println("Enter Ending Number");
		int end = s.nextInt();
		for (int i=start;i<end ;i++ )
		{
			sum(i);
		}
	}
}
