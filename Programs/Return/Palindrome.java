import java.util.Scanner;
class  Palindrome
{
	public static boolean palindrome(int num)
	{
		int temp = num, rev = 0;
		for (int i=temp;i>0 ;i/=10)
		{
			int d = i%10;
			rev = rev*10+d;
		}
		if (num == rev)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		boolean ans = palindrome(num);
		System.out.println("Entered Number is Palindrome : "+ans);
	}
}
