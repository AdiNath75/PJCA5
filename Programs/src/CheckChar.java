import java.util.Scanner;
class CheckChar
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Character");
		char input = s.next().charAt(0);
		if (input >= '0' && input <= '9')
			System.out.println(input+ " is Number");
		else if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
			if (input >= 'a' && input <= 'z')
				System.out.println(input+ " is Lowercase Alphabet");
			else
				System.out.println(input+ " is Uppercase Alphabet");
		else
			System.out.println(input+ " is Special Character");
	}
}