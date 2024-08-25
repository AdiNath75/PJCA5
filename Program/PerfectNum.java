import java.util.Scanner;
class  PerfectNum
{
	public static int perfectNum(int num)
	{
		int sum = 0;
		for (int i=1;i<num;i++ )
		{
			if (num%i==0)
			{
				sum = sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = s.nextInt();
		int ans = perfectNum(num);
		if (num==ans)
		{
			System.out.println("It is Perfect Number");
		}
		else 
			System.out.println("It is not a Perfect Number");
	}
}
