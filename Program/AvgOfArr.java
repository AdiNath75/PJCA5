import java.util.Scanner;
class AvgOfArr 
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=s.nextInt();
		double x[]=new double [n];
		System.out.println("Enter" +n+" values");
		for (int i=0;i<x.length;i++)
		{
			x[i]=s.nextDouble();
		}
		double total=0;
		for (int i=0;i<x.length ;i++ )
		{
			total = total + x[i];
		}
		double avg = total/x.length;
		System.out.println("Average is : "+avg);
	}
}
