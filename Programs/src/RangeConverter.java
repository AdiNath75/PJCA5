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
			KmToMiles(val);
			break;
		default
			System.out.println("Enter value from above Option");
		}
	}
	public static void mmToCm(double num)
	{
		double ans = num*10;
		System.out.println(+num+"MM is "+ans+"CM");
	}
	public static void cmToInch(float a)
	{
		float res = ;
		System.out.println("Conversion of "+num+"MM to "+ans+"CM is: "+ans);
	}
}
