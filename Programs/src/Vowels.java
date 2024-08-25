import java.util.Scanner;
class Vowels
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Alphabet");
		char input = s.next().charAt(0);
		switch (input)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(input+" is Vowel");
			break;
		default :
			System.out.println(input+" is Consonent");
		
		}
	}
}