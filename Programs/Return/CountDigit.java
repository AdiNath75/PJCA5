import java.util.Scanner;
class  CountDigit
{
	public static int countDigit(int num)
	{
		int count = 0;
		for (int i=num;i>0 ;i/=10)
		{
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int ans = countDigit(num);
		System.out.println("Number of digits in "+num+" are : "+ans);
	}
}
