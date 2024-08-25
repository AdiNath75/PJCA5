import java.util.Scanner;
class  Divisors
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = s.nextInt();
		int count = 0;
		for (int i=1;i<=num;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		System.out.println("The Number "+num+" has "+count+" Divisors");
	}
}
