class Increment1 
{
	public static void main(String[] args) 
	{
		int a=5, b=29, f=0;
		a++;
		int e = ++a - --b + ++f;
		f = (a+b+f);
		a = f++ + b++ - --a;
		b = --f;
		f = ++b - --f;
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(e);
	}
}
