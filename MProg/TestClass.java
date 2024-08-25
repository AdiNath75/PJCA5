import java.util.*;
class Test
{
	static int finalCount(int n,int x)
	{
		int count = 0;
		int y=n-x;
		while (x!=y)
		{
			if (x>y) {
				x=x-y;
			}
			else if(y>x) {
				y=y-x;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(finalCount(n,x));	
	}
}
