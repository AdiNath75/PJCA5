class J11 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(a);
		a = 12;
		System.out.println(a);
		test();
	}
	public static void test()
	{
		System.out.println(a);
		a = 100;
		System.out.println(a);
	}

}
