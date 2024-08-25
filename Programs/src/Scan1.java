import java.util.Scanner;
class  Scan1
{
	public static void main(String[] args) 
	{
		Scanner z = new Scanner (System.in);
		System.out.println("Enter the First Character:");
		char c1 = z.next().charAt(0);
		System.out.println("Enter the Second Character:");
		char c2 = z.next().charAt(0);
		int result = c1 * c2;
		System.out.println("The Product of the "+c1+" and "+c2+" is:" +result);
	}
}
