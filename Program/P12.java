import java.util.Scanner;
class  P12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ammount in rupees");
		float rupees = sc.nextFloat();
		float dollar = rupees/75;
		System.out.println(dollar);
	}
}
