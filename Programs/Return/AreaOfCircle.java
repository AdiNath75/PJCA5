import java.util.Scanner;
class  AreaOfCircle
{
	public static double pi()
	{
		double pi = 22.0/7.0;
		return pi;
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Radius of circle");
		double rad = s.nextDouble();
		double area = pi()*(rad*rad);
		System.out.println("Area of Circle is : "+area);
		double perimtr = 2*pi()*rad;
		System.out.println("Perimeter of Circle is : "+perimtr);
	}
}
