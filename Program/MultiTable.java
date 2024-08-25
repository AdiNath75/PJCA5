import java.util.Scanner;
class MultiTable 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = s.nextInt();
		int i =1;
		while (i<=10)
		{
			System.out.println(num*i);
			i++;
		}
	}
}
