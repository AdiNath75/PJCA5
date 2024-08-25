import java.util.Scanner;
class  PrimeDivisor
{
	public static int prime(int num)
	{
		int i, count=0;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
				count++;
		}
		if (count<1)
		{
			return num;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int a = -1, ans=0;
		for (int i=3;i<num;i++ )
		{
			if (num%i==0)
			{
				ans = prime(i);
				if (ans>0)
				{
					System.out.println(ans);
					break;
				}
			}
		}
		if (ans==0)
		{
			System.out.println(a);
		}
	}
}
