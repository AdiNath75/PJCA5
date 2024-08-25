import java.util.Scanner;
class  P13
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature in celcius");
		float celcius = sc.nextFloat();
		float fahrenhait = (celcius*1.8f)+32;
		System.out.println(fahrenhait);
	}
}
