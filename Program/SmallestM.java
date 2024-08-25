import java.util.Scanner;
class  SmallestM
{
	public static int smallest(int a, int b, int c)
	{
		int ans = 0;
		if (a<b && a<c)
		{
			ans = a;
		}
		else if (b<c)
		{
			ans = b;
		}
		else 
			ans = c;
		return ans;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int small = smallest(a,b,c);
		System.out.println("Smallest among "+a+" ,"+b+" & "+c+" is : "+small);
	}
}
