import java.util.Scanner;
class PhonePin
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Pin for Your Phone");
		int mainpin = s.nextInt();
		int pincount=0;
		do
		{
			System.out.println("Enter Pin to Unlock");
			int pin = s.nextInt();
			if (pin==mainpin)
			{
				System.out.println("Logged in Successfully");
				break;
			}
			else
			{
				System.out.println("Pin Incorrect! Please Retry");
				pincount++;
			}
		}while(pincount<=5);
	}
		
}