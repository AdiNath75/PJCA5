import java.util.Scanner;
class  SumSalary
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary of Husband");
		double Hub = s.nextDouble();
		System.out.println("Enter Salary of Wife");
		double Wife = s.nextDouble();
		double Sal = Hub + Wife;
		System.out.println("The Sum Salary of Husband and Wife is:" +Sal);
	}
}
