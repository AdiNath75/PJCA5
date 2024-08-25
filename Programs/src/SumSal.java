import java.util.Scanner;
class  SumSal
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary of Husband");
		float Hub = s.nextFloat();
		System.out.println("Enter Salary of Wife");
		float Wife = s.nextFloat();
		float Sal = Hub + Wife;
		System.out.println("The Sum Salary of Husband and Wife is:" +Sal);
	}
}
