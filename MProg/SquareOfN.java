import java.util.Scanner;
class SquareOfN
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		int Square =n*n;
		System.out.println("Square of "+n+" is : " +Square);
	}
}