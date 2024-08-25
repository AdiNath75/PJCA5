import java.util.Scanner;
class  BoosterForU
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = s.nextInt();
		if (age>0 && age<110)
		{
			if (age>=5 && age<18)
			{
				System.out.println("You can take Moderna or Pfizer");
			}
			else if (age>=18 && age<60)
			{
				System.out.println("Enter the months for completion of your Vaccination");
				int month = s.nextInt();
				if (month>=2)
				{
					System.out.println("YOu can take Moderna vaccine");
				}
				else if (month>=5)
				{
					System.out.println("You can take Moderna or J&J/ Janssen vaccine");
				}
			}
			else if (age>=60)
			{
				System.out.println("You can Take any Booster");
			}
		}
		else
		{
			System.out.println("Invalid Age");
		}
	}
}
