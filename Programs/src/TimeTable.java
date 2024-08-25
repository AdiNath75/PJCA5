import java.util.Scanner;
class TimeTable
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("**********WELCOME**********");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		System.out.println("7. Sunday");
		System.out.println("Enter Your Option");
		int option = s.nextInt();
		switch (option)
		{
			case 1 : System.out.println("Study English");
			break;
			case 2 : System.out.println("Study Marathi");
			break;
			case 3 : System.out.println("Practice Math");
			break;
			case 4 : System.out.println("Enjoy Science");
			break;
			case 5 : System.out.println("Learn History");
			break;
			case 6 : System.out.println("Learn Sanskrit");
			break;
			case 7 : System.out.println("Play....!");
			break;
			default : System.out.println("Enter Option From Menu");
		}

	}
}
