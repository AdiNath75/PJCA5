import java.util.Scanner;
class  Factorial
{
	public static int fact(int num)
	{
		int fact=1;
		for (int i=num ;i!=0 ;i-- )
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int ans = fact(num);
		System.out.println("Factorial of "+num+" is : "+ans);
	}
}
