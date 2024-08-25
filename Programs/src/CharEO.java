import java.util.Scanner;
class CharEO 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Character");
		char x = s.next().charAt(0);
		if(x%2==0)
		System.out.println(x+ " This Character is Even");
		else
			System.out.println(x+ " This Character is Odd");
	}
}
