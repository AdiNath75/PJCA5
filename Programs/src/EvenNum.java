import java.util.Scanner;
class  EvenNum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting number");
		int start = s.nextInt();
		System.out.println("Enter Ending Number");
		int end = s.nextInt();
		while (start <= end)
		{
			if (start%2==0)
				System.out.println(start);
			start++;
		}
	}
}

