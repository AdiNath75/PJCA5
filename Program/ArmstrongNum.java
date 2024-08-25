import java.util.Scanner;
class  ArmstrongNum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = s.nextInt();
		int sum = 0, temp=num;
		do
		{
			int d = num%10;
			sum = sum+d*d*d;
			num=num/10;
		}
		while (num!=0);
		if (sum==temp)
			System.out.println("It is Armstrong Number");
		else 
			System.out.println("It is not Armstrong Number");
		System.out.println(sum);
	}
}
