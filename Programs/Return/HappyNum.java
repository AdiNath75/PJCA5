import java.util.Scanner;
class HappyNum
{
	public static int sum(int num)
	{
		int sum = 0;
		for (int i=num; i>0 ;i/=10 )
		{
			int rem=i%10;
			sum = sum+(rem*rem);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();
		int ans = sum(num);
		while (ans!=1 && ans!=4)
		{
			ans = sum(ans);
		}
		if (ans == 1)
		{
			System.out.println("It is Happy Number");
		}
		else 
		{
			System.out.println("It is Unhappy Number");
		}
	}
}