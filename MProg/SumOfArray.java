import java.util.Scanner;
class  SumOfArray
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of an Arry");
		int n = s.nextInt();
		int sum = 0;
		int x[]=new int [n];
		System.out.println("Enter "+n+" values");
		for (int i=0;i<x.length ;i++ )
		{
			x[i]=s.nextInt();
		}
		for (int i=0;i<x.length ;i++ )
		{
			if (x[i]>0)
			{
				sum=sum+x[i];
			}
		}
		System.out.println(sum);
	}
}
