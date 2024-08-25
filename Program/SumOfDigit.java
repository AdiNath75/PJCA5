import java.util.Scanner;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENter any Number");
		int num = s.nextInt();
		int sum = 0;
		do
		{
			int d = num%10;
			sum = sum+d;
			num = num/10;
		}
		while (num!=0);
		System.out.println("Sum of Digit is: "+sum);
	}
}
