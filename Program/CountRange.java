import java.util.Scanner;
class CountRange 
{
	static int countRange(int x[], int start, int end)
	{
		int count =0;
		for (int i=0;i<x.length ;i++ )
		{
			if (x[i]>=start && x[i]<=end)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("Enter" +n+" values");
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter Start Point");
		int start = s.nextInt();
		System.out.println("Enter End Point");
		int end = s.nextInt();
		int count =countRange(ar,start,end);
		System.out.println("Elements Count between Specified Range: "+count);
	}
}
