import java.util.Scanner;
class CalPlace
{
	public static void unitValue(int num)
	{
		int ans = num%10; 
		System.out.println("The Unit value of "+num+" is "+ans);
	}
	public static void hundread(int num)
	{
		int count = 0;
		for (int i=num;i>0 ; i/=10)
		{
			int ans = i%10; 
			count++;
			if (count==3)
			{
				System.out.println("The Hundread value of "+num+" is "+ans);
			}
		}	
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		unitValue(num);
		hundread(num);
	}
}
