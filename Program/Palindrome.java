import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int rev = 0,t=n;
		do
		{
			int d = n%10;
			rev = rev*10+d;
			n=n/10;
		}while (n!=0);

		if (rev==t)
			System.out.println("The Number is Palindome");
		else
			System.out.println("The Number is not Palindome");

	}
}