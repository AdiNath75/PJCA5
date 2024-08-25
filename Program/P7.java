import java.util.Scanner;
class P7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of a Circle");
		float radius = sc.nextFloat();
		float perimeter = (2*(22/7*radius));
		System.out.println(perimeter);
	}
}
