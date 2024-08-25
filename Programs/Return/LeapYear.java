import java.util.Scanner;
class LeapYear 
{
	public static void leapYear(int year)
	{
		if (year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println(year+" is a Leap Year");
		}
		else
			System.out.println(year+" is not a Leap Year");
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = s.nextInt();
		leapYear(year);
	}
}
