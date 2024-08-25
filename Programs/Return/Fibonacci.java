import java.util.Scanner;
class  Fibonacci
{
	public static void fibo(int count)
	{
		int num1=0, num2=1, ans=0;
		System.out.print(num1+" "+num2);
		for (int i=2;i<count;++i)
		{
			ans = num1+num2;
			System.out.print(" "+ans);
			num1=num2;
			num2=ans;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter n val for 0 to N Range");
		int val = s.nextInt();
		fibo(val);
	}
}
