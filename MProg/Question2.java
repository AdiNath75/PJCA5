import java.util.Scanner;
class  Question2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary of Employee");
		double sal = s.nextDouble();
		System.out.println("Enter Servie in Years");
		int year = s.nextInt();
		if (year>5)
		{
			double bonus = (35*sal)/100;
			System.out.println("You got a Bonus of "+bonus+" Rs");
		}
		else 
		{
			double bonus  = (15*sal)/100;
			System.out.println("You got bouns of  "+bonus+" Rs");
		}
	}
}
