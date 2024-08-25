import java.util.Scanner;
class EvenN2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		int i = 2;
		while (i<=n)
		{
			System.out.println(i);
			i=i+2;
		}
		System.out.println("Thank You");
	}
}
