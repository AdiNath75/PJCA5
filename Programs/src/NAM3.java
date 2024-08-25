import java.util.Scanner;
class NAM3
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		add();
		sub();
		System.out.println("Main End");
	}
	public static void add()
	{
		int a=20, b=15;
		System.out.println("Sum of "+a+" & "+b+" is: "+(a+b));
	}
	public static void sub()
	{
		int a = 40, b = 15;
		System.out.println("Differece between "+a+" & "+b+" is: "+(a-b));
	}
}
