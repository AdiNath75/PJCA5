import java.util.Scanner;
class CharToBin
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		int num = c ;
		String str = " ";
		while (num>0)
		{
			int rem = num%2;
			str = rem + str;
			num = num/2;
		}
		System.out.println(str);
	}
}
