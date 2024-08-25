import java.util.Scanner;
class LightBill
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Units");
		double Unit = s.nextDouble();
		if (Unit>0 && Unit<=50)
		{
			System.out.println((Unit*0.5)+(20*0.2));
		}
	}
}
