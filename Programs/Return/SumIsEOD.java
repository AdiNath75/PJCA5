import java.util.Scanner;
class SumIsEOD
{
	public static boolean sumIsEO(int num)
	{
		int sum = 0;
		for (int i=num;i>0;i/=10 )
		{
			int rem = i%10;
			sum = sum+rem;
		}
		if (sum%2==0)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		boolean ans = sumIsEO(num);
		if (ans == true)
		{
			System.out.println("Sum of Digit is Even");
		}
		else
			System.out.println("Sum of Digit is Odd");
	}
}
