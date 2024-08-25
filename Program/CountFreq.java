import java.util.Scanner;
class CountFreq 
{
	static int printFreq(int ar[])
	{
		int big = ar[0];
		for (int i=0; i<ar.length;i++ )
		{
			if (big<ar[i])
			{
				big =ar[i];
			}
		}
		int count[]=new int [big+1];
		for (int i=0;i<ar.length ;i++ )
		{
			count[ar[i]]++;
		}
		for (int i=0;i<count.length ;i++ )
		{
			if (count[i]!=0)
			{
				System.out.println(i+"--> "+count[i]);
			}
			
		}
		return big;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("Enter" +n+" values");
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=s.nextInt();
		}
		int b = printFreq(ar);
		System.out.println(b);
	}
}
