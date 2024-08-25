import java.util.Scanner;
class SumEOD
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int sum1 = 0;
		do { int d = n%10;
			 int a = d%2;
				while (a==0)
				{
					sum1 = sum1 + d;
				}		
			n=n/10;
			}while (n!=0);
		System.out.println(sum1);
		
	}
}