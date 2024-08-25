import java.util.Scanner;
class P6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in KM");
		float distance = sc.nextFloat();
		System.out.println("Enter time taken in hours");
		float time = sc.nextFloat();
		float speed = distance/time;
		System.out.println(speed);

	}
}
