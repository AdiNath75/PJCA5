import java.util.Scanner;
class  PrimeRange
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
				System.out.print(i+" ");
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start = s.nextInt();
		System.out.println("Enter Ending Number");
		int end = s.nextInt();
		for (int i=start;i<end ;i++ )
		{
			prime(i);
		}
	}
}
