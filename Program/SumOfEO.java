import java.util.Scanner;
class SumOfEO 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int even = 0;
		int odd = 0;
		do{ 
			int d = n%10;
				if (d%2==0)
				{
					even = even + d;
				}
				else
				{
					odd = odd + d;
				}
		   }while (n!=0);
		System.out.println(even);
		System.out.println(odd);
	}
}