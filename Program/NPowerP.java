import java.util.Scanner;
class NPowerP 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Value of N");
		int N = s.nextInt();
		System.out.println("Enter Value of p");
		int P = s.nextInt();
		int pw = 1;
		while (P>0)
		{
			pw = pw*N;
			P--;
		}
		System.out.println("N to The Power of P is :"+pw);
	}
}
