import java.util.Scanner;
class ProdOfDigit
{
	public static int prodOfDigit(int num)
	{
		int prod = 1;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem = i%10;
			prod = prod*rem;
		}
		return prod;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int prod = prodOfDigit(num);
		System.out.println(prod);
	}
}
