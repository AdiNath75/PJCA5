import java.util.Scanner;
class VowelConsonent 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Character");
		char c1 = s.next().charAt(0);
		switch (c1)
		{
		case 'a':
			System.out.println("It is Vowel");
			break;

		case 'e':
			System.out.println("It is Vowel");
			break;
		case 'i':
			System.out.println("It is Vowel");
			break;
		case 'o':
			System.out.println("It is Vowel");
			break;
		case 'u':
			System.out.println("It is Vowel");
			break;
		default :
			System.out.println("It is Consonent");
		
		}
	}
}
