import java.util.Scanner;
class  SumOfSquare
{
	public static int sumOfSquare(int num)
	{
		int sum = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum+square(rem);
		}
		return sum;
	}
	public static int square(int i)
	{
		return i*i;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int ans = sumOfSquare(num);
		System.out.println("Sum Of Square of Digit is : "+ans);
	}
}
