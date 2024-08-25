import java.util.Scanner;
class ConvertCase
{
	public static void convertCase(char ch)
	{
		if (ch>='A'&&ch<'Z' || ch>='a' && ch <='z')
		{
			if (ch>='A'&&ch<'Z')
			{
				char lc = (char)(ch+32);
				System.out.println(lc);
			}
			else if (ch>='a' && ch <='z')
			{
				char uc = (char)(ch-32);
				System.out.println(uc);
			}
		}
		else
			System.out.println("Enter only Character");
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = s.next().charAt(0);
		convertCase(ch);
	}
}