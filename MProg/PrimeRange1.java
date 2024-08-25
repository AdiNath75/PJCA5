import java.util.Scanner;
class  PrimeRange1
{
	public static void prime(int num, int range)
	{
		int i;
		int count = 0;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
				break;
		}
		if (num==i)
		{
			System.out.print(i+" ");
			count++;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter count Number");
		int range = s.nextInt();
		for (int i=0; ; i++)
		{
			prime(i,range);
		}
	}
}
