import java.util.Scanner;
class MainEO4 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		switch (a%2)
		{
			case 0 : System.out.println(a+" :is the even");
			break;
			case 1 : System.out.println(a+ " :is the odd");
			break;
		}

	}
}
