import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int rev = 0,temp=n;
		while (temp!=0)
		{
			int rem = temp%10;
			rev = rev*10+rem;
			temp/=10;
		}
		if (rev==n)
			System.out.println("The Number is Palindome");
		else
			System.out.println("The Number is not Palindome");

	}
}