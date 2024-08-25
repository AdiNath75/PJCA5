import java.util.Scanner;
class Ascii
{
	public static void ascii(char c1)
	{
		int val = c1; 
		System.out.println("The ASCII value of "+c1+" is "+val);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Character");
		char c1 = s.next().charAt(0);
		ascii(c1);
	}
}
