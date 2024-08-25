import java.util.Scanner;
class BloodDonate
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Hemoglobin level");
		double HB = s.nextDouble();
		if(HB>=13.0 && HB<=20.0)
		System.out.println("You can Donate Blood");
		else
			System.out.println("Your HB is Low Please take care");
	}
}
