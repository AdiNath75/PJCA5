import java.util.Scanner;
class PowerCal
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		square(num);
		cube(num);
		fourthPower(num);
		fifthPower(num);
	}
	public static void square(int num)
	{
		int ans = num*num;
		System.out.println("Square of "+num+" is: "+ans);
	}
	public static void cube(int n)
	{
		int res = n*n*n;
		System.out.println("Cube of "+n+" is: "+res);
	}
	public static void fourthPower(int x)
	{
		int power = x*x*x*x;
		System.out.println("Fourth power of "+x+" is: "+power);
	}
	public static void fifthPower(int z)
	{
		int power = z*z*z*z*z;
		System.out.println("Fifth Power of "+z+" is: "+power);
	}
}
