class Problem 
{
	static int a,b;
	static double c, d;
	static
	{
		c = test1(a,b) + test2(3,7);
		System.out.println(c);
		a = a+b;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		d = test2(c,a) + test1(10,2);
		System.out.println(d);
		d = 50;
		System.out.println(test2(d,0));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static int test1(int a, int b)
	{
		double ans = test2(a,b);
		return (int) (a*b*ans);
	}
	public static int test2(double a, int b)
	{
		return (int)((a*a)+2*(a+b)+(b*b));
	}
}
