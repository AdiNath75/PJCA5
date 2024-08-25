import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = s.nextInt();
		System.out.println("Enter Second Number");
		int num2 = s.nextInt();
		add(num1,num2);
		sub(num1,num2);
		multiply(num1,num2);
		division(num1,num2);
		mod(num1,num2);
	}
	public static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum of "+a+" & "+b+" is: "+sum);
	}
	public static void sub(int m, int n)
	{
		int diff = m-n;
		System.out.println("Differnce between "+m+" & "+n+" is: "+diff);
	}
	public static void multiply(int x, int y)
	{
		int prod = x*y;
		System.out.println("Product of "+x+" & "+y+" is: "+prod);
	}
	public static void division(double p, double q)
	{
		double div = p/q;
		System.out.println("Divion of "+p+" & "+q+" is: "+div);
	}
	public static void mod(float p, float q)
	{
		float mod = p%q;
		System.out.println("Remainder of "+p+" & "+q+" is: "+mod);
	}
}
