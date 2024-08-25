import java.util.Scanner;
class  ProdIsPalindrome
{
	public static int prodOfDigit(int num)
	{
		int prod = 1;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			prod = prod*rem;
		}
		return prod;
	}
	public static boolean palindrome(int prod)
	{
		int temp = prod, rev = 0;
		for (int i=temp;i>0 ;i/=10)
		{
			int d = i%10;
			rev = rev*10+d;
		}
		if (prod == rev)
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
		int prod = prodOfDigit(num);
		boolean ans = palindrome(prod);
		System.out.println("Product od Digit of Number is Palindrome : "+ans);
	}
}
