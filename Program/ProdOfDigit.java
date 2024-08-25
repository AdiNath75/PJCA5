import java.util.Scanner;
class ProdOfDigit
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int prod = 1;
		do
		{
			int d = n%10;
			prod = prod *d;
			n=n/10;
		}
		while (n!=0);
		System.out.println(prod);
	}
}