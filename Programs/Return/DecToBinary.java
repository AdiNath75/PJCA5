import java.util.Scanner;
class  DecToBinary
{
	public static String decToBin(int num)
	{
		String binary = "";
		while (num>0)
		{
			int rem = num%2;
			binary = rem + binary;
			num/=2;
		}
		return binary;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = s.nextInt();
		String binary = decToBin(num);
		System.out.println(binary);
	}
}
