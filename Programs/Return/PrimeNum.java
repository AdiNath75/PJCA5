import java.util.Scanner;
class  PrimeNum
{
	public static void prime(int num)
	{
		int i;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
				break;
		}
		if (num==i)
			{
				System.out.println("It is Prime Number");
			}
			else 
			{
				System.out.println("It is a Composite Number");
			}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		prime(num);
	}
}
