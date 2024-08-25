import java.util.Scanner;
class PassFail
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks");
		float Marks = s.nextFloat();
		if (Marks>=0 && Marks<=100)
		{
			if (Marks >= 35)
			{
				System.out.println("Pass...!");
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