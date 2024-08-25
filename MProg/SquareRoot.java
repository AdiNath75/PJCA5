import java.util.Scanner;
class  SquareRoot
{
	public static void squareRoot(int num)
	{
		int i;
		for ( i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				int root = i*i;
				if (num==root)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		squareRoot(num);
	}
}
