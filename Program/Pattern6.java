import java.util.Scanner;
class Pattern6
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		for (int i=1; i<=n; i++)
		{
			for (int j=i; j<=n; j++)
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
}