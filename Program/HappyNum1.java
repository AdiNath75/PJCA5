import java.util.Scanner;
class HappyNum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s.nextInt();
		while (n>10)
		{
			int sum =0;
			do
			{
				int d=n%10;
				sum =sum+d*d;
				n=n/10;
			}while (n!=0);
			n=sum;
		}
		if (n==1 || n==7)
			System.out.print("It is Happy Number");
		else 
			System.out.println("Unhappy Number");
	}
}
