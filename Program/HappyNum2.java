import java.util.Scanner;
class  HappyNum2
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		while (num>9)
		{
			int sum = 0;
			for (int i=num;i>0 ;i/=10 )
			{
				int rem = i%10;
				sum = sum+rem*rem;
			}
			num = sum;
		}
		if (num==1 || num==7)
			System.out.print("Happy Number");
		else
			System.out.println("Not a Happy Number");
	}
}