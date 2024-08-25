import java.util.Scanner;
class  FactorialRange
{
	public static int fact(int num)
	{
		int fact=1;
		int i;
		for ( i=num ;i!=0 ;i--)
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
		System.out.println("Enter Ending Number");
		int end = s.nextInt();
		for (int i=start;i<end ;i++ )
		{
			int ans = fact(i);
			System.out.println("Factorial of "+i+" is "+ans);
		}
	}
}