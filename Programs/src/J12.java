class J12 
{
	static String str = "Hello";
	public static void main(String[] args) 
	{
		System.out.println(str);
		String str = "Bye";
		System.out.println(str);
		str = "Hii";
		System.out.println(str);
		System.out.println(J12.str);
		J12.str = "Hii";
		System.out.println(str);
		System.out.println(J12.str);
	}
}
