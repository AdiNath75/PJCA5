import java.util.Scanner;
class  SpecTwoDigit
{
	public static boolean specTwoDigit(int num)
	{
		int sum = sum(num);
		int prod = prod(num);
		int ans = sum + prod;
		if (ans == num)
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
	public static int prod(int num)
	{
		int prod = 1;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			prod = prod*rem;
		}
		return prod;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = s.nextInt();
		boolean ans = specTwoDigit(num);
		if (ans == true)
		{
			System.out.println("The "+num+" is a Special Two Digit Number");
		}
		else
			System.out.println("The "+num+" is not a Special Two Digit Number");
	}
}
