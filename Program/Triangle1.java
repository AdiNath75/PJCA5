import java.util.Scanner;
class Triangle1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		for (int i=1; i<=n; i++)
		{
			for (int j=5-i; j>=1; j--)
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(i+" ");
			}
			for (int j=i-1;j>=1 ;j-- )
			{
				System.out.print(i+" ");
			}
		System.out.println("  ");
		}
	}
}