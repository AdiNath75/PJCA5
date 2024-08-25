import java.util.Scanner;
class  HCF
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = s.nextInt();
		System.out.println("Enter Second Number");
		int b = s.nextInt();
		int hcf = a<b?a:b;
		while (true)
		{
			if (a%hcf==0 && b%hcf==0)
			{
			System.out.println("The HCF of "+a+" and "+b+" is "+hcf);
			break;
			}
			hcf--;
		}
	}
}
