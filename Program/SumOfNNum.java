import java.util.Scanner;
class SumOfNNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		int sum = 0;
		while (n>0)
		{
			sum = sum+n;
			n--;	
		}
		System.out.println(sum);
		System.out.println("Thank You");
	}
}
