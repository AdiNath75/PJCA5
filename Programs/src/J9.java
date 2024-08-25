class J9 
{
	static double d = 3.14;
	public static void main(String[] args) 
	{
		System.out.println(d);
		int d = 10;
		System.out.println(d);
		test();
	}
	public static void test()
	{
		System.out.println(d);
		char d ='W';
		System.out.println(d);
		System.out.println(J9.d);
	}
}
