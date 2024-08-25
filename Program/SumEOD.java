import java.util.Scanner;
class SumEOD
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int n = s.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		do { 
			int d = n%10;
				switch (d%2)
				{
					case 0 :
						sum1=sum1+d;
						break;
					case 1 : 
						sum2=sum2+d;
						break;
				}
			 n=n/10;
			}while (n!=0);
			System.out.println("Sum of Even digits is: "+sum1);
			System.out.println("Sum of Odd digits is: "+sum2);
	
	}
}