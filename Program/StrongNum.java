import java.util.Scanner;
class StrongNum
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int sum = 0, temp=n;
		do
		{ int d = n%10;
		  int fact= 1;
			while (d>1)
			{
				fact = fact*d;
				d--;
			}
		  sum = sum + fact;
		  n=n/10;
		}while(n!=0);
		if (temp==sum)
			System.out.println("This is Strong number");
		else
			System.out.println("This is not a Strong number");
	}
}