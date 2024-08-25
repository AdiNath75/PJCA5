import java.util.Scanner;
class  AreaOfRectangle
{
	public static void area(double l, double b)
	{
		double area = l*b;
		System.out.println("Area of Circle is : "+area+" sq.units");
	}
	public static void perimetr(double l, double b)
	{
		double perimetr = 2*(l+b);
		System.out.println("Area of Circle is : "+perimetr+" units");
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		double length = s.nextDouble();
		System.out.println("Enter Breadth of Rectangle");
		double breadth = s.nextDouble();
		area(length, breadth);
		perimetr(length, breadth);
		
	}
}
