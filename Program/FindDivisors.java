import java.util.Scanner;
class FindDivisors
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any value");
		int num = s.nextInt();
		int i = 2;
		int count = 0;
		while (i<=num-1)
		{
			if(num%i==0)
				System.out.println(" "+i);
				i++;
		}
	}
}
