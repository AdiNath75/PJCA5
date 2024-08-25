import java.util.Scanner;
class  PrimeCount
{
	static boolean isPrimeNumber(int n)
	{
		for (int i=2;i<=n/2 ;i++ )
		{
			if (n%i==0)
				return false;
		}
		return true;
	}
	static int countPrime(int []x)
	{
		int count=0;
		for (int i=0;i<x.length ;i++ )
		{
			boolean rs=isPrimeNumber(x[i]);
			if (rs==true)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("Enter" +n+" values");
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=s.nextInt();
		}
		int pc =countPrime(ar);
		System.out.println("Number of Prime Numbers : "+pc);
	}
}
