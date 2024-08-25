import java.util.Scanner;
class CriteriaEON
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Percentage");
		double percent = s.nextDouble();
		if (percent>=0 && percent<=100)
		{
			if (percent>=60 && percent<=100)
			{
				System.out.println("You are Eligible You can Apply");
			}
			else
			{
				System.out.println("You are not Eligible Better Luck next time");
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}