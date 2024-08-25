import java.util.Scanner;
class DistanceConversion
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Select Conversion from below");
		System.out.println("1. MM to CM");
		System.out.println("2. CM to Inches");
		System.out.println("3. Inches to Foot");
		System.out.println("4. Foot to Meter");
		System.out.println("5. Meter to KM");
		System.out.println("6. Km to Miles");
		int num = s.nextInt();
		System.out.println("Enter value to Convert from One to Another");
		int val = s.nextInt();
		switch (num)
		{
		case 1:
			mmToCm(val);
			break;
		case 2:
			cmToInches(val);
			break;
		case 3:
			inchesToFoot(val);
			break;
		case 4:
			footToMeter(val);
			break;
		case 5:
			meterToKm(val);
			break;
		case 6:
			kmToMiles(val);
			break;
		default :
			System.out.println("Enter value from above Option");
		}
	}
	public static void mmToCm(double num)
	{
		double ans = num*10;
		System.out.println(num+"MM is "+ans+"CM");
	}
	public static void cmToInches(double a)
	{
		double res = a/2.54;
		System.out.println(a+"CM is "+res+"Inches");
	}
	public static void inchesToFoot(double i)
	{
		double res = i/12;
		System.out.println(i+"Inches is "+res+"Foot");
	}
	public static void footToMeter(double f)
	{
		double ans = f/3.281;
		System.out.println(f+"Foot is "+ans+"Meter");
	}
	public static void meterToKm(float m)
	{
		float res = m/1000;
		System.out.println(m+"Meter is "+res+"KM");
	}
	public static void kmToMiles(double Km)
	{
		double res = Km/1.609;
		System.out.println(Km+"KM is "+res+"Miles");
	}
}
