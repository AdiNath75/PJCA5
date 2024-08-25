import java.util.Scanner;
class  PrimeRotate
{
	public static int count(int num)
	{
		int count = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			count++;
		}
		return count;
	}
	public static int power(int n, int p)
	{
		int pow=1;
		for (int i=p;i>0 ;i-- )
		{
			pow = pow*n;
		}
		return pow;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		System.out.println("Enter Number of Rotation");
		int rotate = s.nextInt();
		int ans = 0, count=count(num);
		for (int i=1;i<=rotate ;i++ )
		{
			int rem = num%10;
			num/=10;
			ans = rem*power(10,count-1)+num;
			num=ans;
		}
		
		System.out.println(num);
	}
}
