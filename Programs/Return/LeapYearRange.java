import java.util.Scanner;
class LeapYearRange 
{
	public static void leapYear(int year)
	{
		if (year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println(" "+year);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int start = s.nextInt();
		System.out.println("Enter Ending Number");
		int end = s.nextInt();
		for (int i=start;i<end ;i++ )
		{
			leapYear(i);
		}
	}
}