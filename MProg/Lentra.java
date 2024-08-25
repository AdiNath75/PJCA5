import java.util.Scanner;
class Lentra
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n = s.nextInt();
		int x[]= new int[n];
		System.out.println("Enter "+n+" Values");
		for (int i=0;i<x.length ;i++ )
		{
			x[i]=s.nextInt();
		}
		for (int i=0;i<x.length ;i++ )
		{
			if (x[i]>0)
			{
				int rem = x[i]%10;
				if (x[i]<59 && rem==8)
				{
					x[i]=-3;
				}
				else if (x[i]<59)
				{
					x[i]=-9;
				}
				else if (rem==8)
				{
					x[i]=-4;
				}
				System.out.println(x[i]+" ");	
			}
			else
			{
				x[i] = 0;
			}
		}
		
		
	}
}
