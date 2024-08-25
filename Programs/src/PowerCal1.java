import java.util.Scanner;
class  PowerCal1
{
	public static void powerCal(int num, int pow)
	{
		int power = 1;
		for (int i=pow;i>0 ;i-- )
		{
			power = power*num;
		}
		System.out.println("The "+pow+" power of "+num+" is : "+power);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		System.out.println("Enter the Power value");
		int pow = s.nextInt();
		powerCal(num,pow);
	}
}
