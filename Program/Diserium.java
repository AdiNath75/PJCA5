import java.util.Scanner;
class Diserium 
{
	static boolean isDiserium(int x)
	{
		int sum = 0, temp=x;
		int dc = countDigits(x);
		do
		{
			int r = x%10;
			sum=sum+pow(r,dc);
			dc--;
			x/=10;
		}while (x!=0);
		if (sum==temp)
		{
			return true;
		}
		else 
			return false;
	}
	static int countDigits(int n)
	{
		int count = 0;
		do
		{
			count++;
			n/=10;
		}while (n!=0);
		return count;
	}
	static int pow(int n, int p)
	{
		int pw=1;
		while (p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=s.nextInt();
		boolean b = isDiserium(n);
		System.out.println("Entered Number is Diserium: "+b);
	}
}
