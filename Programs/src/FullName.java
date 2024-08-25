import java.util.Scanner;
class  FullName
{
	public static void main(String[] args) 
	{
		Scanner y = new Scanner (System.in);
		System.out.println("Enter the First Name:");
		String First = y.next();
		System.out.println("Enter the Middle Name:");
		String Middle = y.next();
		System.out.println("Enter the Last Name:");
		String Last = y.next();
		String FullName = First+" "+Middle+" "+Last;
		System.out.println("Your Full Name is:" +FullName);
		
		y.nextLine();
		System.out.println("What do you say..?");
		String opinion = y.nextLine();
		System.out.println(opinion);

	}
}
