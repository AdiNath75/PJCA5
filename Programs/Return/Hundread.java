import java.util.Scanner;
class  Hundread
{
	public static int hundread(int num)
	{
		int ans = num%1000;
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int ans = hundread(num);
		System.out.println("Value from Hundread place of "+num+" is : "+ans);
	}
}
