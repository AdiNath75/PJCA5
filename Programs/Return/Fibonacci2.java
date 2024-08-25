import java.util.Scanner;
class  Fibonacci2
{
	public static void main(String[] args) 
	{
		int a=0, b=1;
		int c;
		for ( int i=0;i<5 ;i++ )
		{
			c = a + b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}
}
