import java.util.Scanner;
class ThreeDigit 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the integer number");
		int num = s.nextInt();
		if((num>9 && num<1000) || (num<-9 && num>-1000))
		System.out.println(num+" is Three Digit number");
		else
		System.out.println(num+" is Not Three Digit Number");
		
	}
}
