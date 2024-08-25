import java.util.Scanner;
class Question1 
{
	static int getDivisor(int list[])
	{
		int count = 0;
		for (int i=0;i<list.length ;i++ )
		{
			if (list[i]>=77)
			{
				return 0;
			}
			if (list[i]%7==0)
			{
				count++;
			}
		}
		return count;
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
		int count = getDivisor(ar);
		System.out.println("Number Divided by 7 =:"+count);
	}
}
