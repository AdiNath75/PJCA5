import java.util.Scanner;
class  Relation12
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter First int:" );
		int a = x.nextInt();
		System.out.println("Enter Second int" );
		int b = x.nextInt();
		boolean ans = (a==b);
		System.out.println("Entered int are same:"+ans);

		System.out.println("Enter First Double:" );
		double c = x.nextDouble();
		System.out.println("Enter Second Double" );
		double d = x.nextDouble();
		boolean res = (c>d);
		System.out.println("The value "+c+" is Greater than "+d+" :" +ans);

		System.out.println("Enter First float:" );
		float f1 = x.nextFloat();
		System.out.println("Enter Second Float" );
		float f2 = x.nextFloat();
		boolean f3 = (f1<=f2);
		System.out.println("The value "+f1+" is Less than or equal to "+f2+" :" +f3);

		Scanner y = new Scanner(System.in);
		System.out.println("Enter First Byte:" );
		byte b1 = y.nextByte();
		System.out.println("Enter Second Byte" );
		byte b2 = y.nextByte();
		boolean b3 = (b1!=b2);
		System.out.println("The Bytes "+b1+" and "+b2+" are not same :" +b3);
	}
}
