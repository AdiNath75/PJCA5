import java.util.Scanner;
class PrimeComposite 
{
	public static boolean primeCompo(int num)
	{
		int count = 0;
		for (int i=num;i>0 ;i-- )
		{
			int ans = (num%i);
			if (ans==0)
			{
				count++;	
			}
		}
		if (count == 2)
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
		int num=s.nextInt();
		boolean ans = primeCompo(num);
		if (ans==true)
		{
			System.out.println("It is Prime Number");
		}
		else 
		{
			System.out.println("It is Composite Number");
		}
	}
}
