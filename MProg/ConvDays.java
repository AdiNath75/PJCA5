import java.util.Scanner;
class  ConvDays
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Days");
		int val = s. nextInt();
		int year = 0, weak = 0, days = 0;
		if (val>=365)
		{
			year = val/365;
			int rem = val %365;
			weak = rem/7;
			days = rem%7;
		}
		else if (val<365)
		{
			weak = val/7;
			days = val%7;
		}
		System.out.println(year+"year");
		System.out.println(weak+"Weak");
		System.out.println(days+"Days");
	}
}
