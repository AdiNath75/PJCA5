import java.util.Scanner;
class Question 
{
	static int getTotal(int myList[])
	{
		int total=0;
		for (int i=0;i<myList.length ;i++ )
		{
			if (i%2==0)
			{
				total = total+myList[i];
			}
			else
				total= total-myList[i];
		}
		return total;
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
		int b = getTotal(ar);
		System.out.println(b);
	}
}
