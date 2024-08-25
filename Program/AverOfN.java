import java.util.Scanner;
class AverOfN
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		float n = s.nextFloat();
		int sum =0;
		int i = 0;
		while (i<=n)
		{
			sum = i+sum;
			i++;
		}
		float avg =sum/n;
		System.out.println(avg);
		System.out.println("Thank You");
	}
}
