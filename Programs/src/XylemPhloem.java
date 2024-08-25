import java.util.Scanner;
class  XylemPhloem
{
	public static boolean xylemPhloem(int num)
	{
		int sum1=0, sum2=0, i;
		sum1+=num%10;
		num/=10;
		for (i=num;i>9 ;i/=10 )
		{
			sum2+=i%10;
		}
		sum1+=i%10;
		if (sum1==sum2)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		boolean ans = xylemPhloem(num);
		if (ans)
		{
			System.out.println("It is Xylem");
		}
		else
		{
			System.out.println("It is Phloem");
		}
	}
}
