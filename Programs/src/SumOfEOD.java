import java.util.Scanner;
class SumOfEOD
{
	public static void evenOddSum(int num)
	{
		int even = 0,odd=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem =i%10;
			if (rem%2==0)
			{
				even = even+rem;
			}
			else
				odd = odd+rem;
		}
		System.out.println("Sum of Even Digit is: "+even);
		System.out.println("Sum of Odd Digit is : "+odd);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		evenOddSum(num);
	}
}
