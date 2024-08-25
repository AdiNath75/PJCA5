class Logical1 
{
	public static void main(String[] args) 
	{
		System.out.println("For AND Operator");
		System.out.println(10>12 && 10==11);
		System.out.println(100<'a' && 'a'!='z');
		System.out.println(10>9 && 10<9.9);
		System.out.println('a'>'A' && 10.012f<10.0123d);

		System.out.println("For OR Operator");
		System.out.println(123>321 || 20<15);
		System.out.println(100==101 || 100!=101);
		System.out.println(('a'>'A' && 10.012f<10.0123d) || (100<'a' && 'a'!='z'));
		System.out.println(true==true && 'Z'<'z');

		System.out.println("For NOT Operator");
		System.out.println(!(true==true && 'Z'<'z'));
		System.out.println(!(100<'a' && 'a'!='z'));
		System.out.println(!(('a'>'A' && 10.012f<10.0123d) || (100<'a' && 'a'!='z')));

	}
}
