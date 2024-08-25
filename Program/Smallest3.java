import java.util.Scanner;
class  Smallest4
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Four Integer Value");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d= s.nextInt();
		int e = a;
		if (b<e)
			e = b;
		int f = e;
		if (c<f)
			f = c;
		int g = f;
		if (d<g)
			g = d;
		System.out.println("Smallest Value is:" +g);
	}
}
