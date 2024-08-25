import java.util.Scanner;
class FactOfN 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		int fact =1 ;
		while (n>0)
		{
			fact = fact*n;
			n--;
		}
		System.out.println(fact);
		System.out.println("Thank You");
	}
}
