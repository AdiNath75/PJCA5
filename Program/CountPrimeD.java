import java.util.Scanner;
class CountPrimeD 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int pcount = 0;
		do
		{ 
		 int r =n%10;
			if (r==2 || r==3 || r==5 || r==7)
				pcount++;
		  n=n/10;
		}while (n!=0);
		System.out.println("Number of Prime Digits : " +pcount);
	}
}