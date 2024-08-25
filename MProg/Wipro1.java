import java.util.Scanner;
class Wipro1
{
	public static int charToNum(char c1)
	{
		String st = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = 1;
		for (int i=0;i<st.length() ;i++ )
		{
			char ch = st.charAt(i);
			if (ch==c1)
			{
				 n = i;
			}
		}
		return n;
	}
	public static void numToChar(int num)
	{
		String st = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i=0;i<st.length() ;i++ )
		{
			char ch = st.charAt(i);
			if (num==i)
			{
				System.out.println(ch);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Character");
		char c1 = s.next().charAt(0);
		System.out.println("Enter any Number");
		int num1 = s.nextInt();
		int num2 = charToNum(c1);
		int ans = num1+num2;
		if (ans>26)
		{
			ans = ans-26;
		}
		numToChar(ans);
	}
}
