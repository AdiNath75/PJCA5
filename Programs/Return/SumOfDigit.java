import java.util.Scanner;
class SumOfDigit
{
	public static int sumOfDigit(int num)
	{
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int sum =sumOfDigit(num);
		System.out.println(sum);
	}
}
