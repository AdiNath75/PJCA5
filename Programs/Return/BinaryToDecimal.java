import java.util.Scanner;
class  BinaryToDecimal
{
	public static int power(int base, int p)
	{
		int pow = 1;
		for (int i=p;i>0 ;i-- )
		{
			pow = pow*base;
		}
		return pow;
	}
	public static int binToDec(int num)
	{
		int sum = 0, raise=0;
		for (int i = num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum+(rem*power(2,raise));
			raise++;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Binary Value");
		int num = s.nextInt();
		int ans = binToDec(num);
		System.out.println(ans);
	}
}
