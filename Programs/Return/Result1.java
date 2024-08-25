import java.util.Scanner;
class  Result1
{
	public static String result(int p)
	{
		if (p>=0 && p<=100)
		{
			if (p==35)
			{
				return "Just Pass";
			}
			else if (p>35 && p<60)
			{
				return "Second Class";
			}
			else if (p>=60 && p<75)
			{
				return "First Class";
			}
			else if (p>=75)
			{
				return "Distinction";
			}
			else 
				return "Fail";
		}
		else 
			return "Invalid Input";
	}
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		int percent = s.nextInt();
		String ans = result(percent);
		System.out.println(ans);
	}
}
