import java.util.Scanner;
class PatternA
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n");
		int n = s.nextInt();
		char alpha = 'A';
		for (int i=0; i<=n; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print((char) (alpha + j)+" ");
		
			}
		System.out.println();
		
		}
	}
}