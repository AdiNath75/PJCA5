import java.util.Scanner;
class IfElseIf1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Percentage");
		float percent = s.nextFloat();
		if (percent>=0 && percent<=100)
		{
			if (percent == 35)
			{
				System.out.println("Pass...!");
			}
			else if (percent>=35 && percent<60)
			{
				System.out.println("Second class...!");
			}
			else if (percent>=60 && percent<75)
			{
				System.out.println("First class...!");
			}
			else if (percent>=75 && percent<=100)
			{
				System.out.println("Distinction...!");
			}
			else
			{
				System.out.println("Fail...!");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}