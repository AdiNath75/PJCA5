import java.util.Scanner;
class  AddNum2
{
	public static void main(String[] args) 
	{
		Scanner x = new Scanner (System.in);
		System.out.println("Enter the First Number:");
		int num1 = x.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = x.nextInt();
		int result = num1 + num2;
		System.out.println("The Sum of the "+num1+" and "+num2+" is:" +result);
	}
}
