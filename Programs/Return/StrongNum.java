import java.util.Scanner;
class  StrongNum
{
	public static int strong(int num)
	{
		int sum = 0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			sum = sum+fact(rem);
		}
		return sum;
	}
	public static int fact(int num)
	{
		int fact= 1;
		for (int i=num;i>0 ;i-- )
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int ans = strong(num);
		if (ans == num)
		{
			System.out.println("The Number "+num+" is a Strong Number");
		}
		else 
			System.out.println("The Number " +num+ " is Not a Strong Number");
	}
}
