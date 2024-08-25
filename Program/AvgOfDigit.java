import java.util.Scanner;
class AvgOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int sum = 0;
		int count = 0;
		do
		{
			int d = num%10;
			sum = sum+d;
			count++;
			num = num/10;
		}
		while (num!=0);
		int avg = sum/count;
		System.out.println("Average of Digit is: "+avg);
	}
}
