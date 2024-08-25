import java.util.Scanner;
class  Wipro3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String a = "";
		int num = Integer.parseInt(str);
		System.out.println(num);
		int n = str.length();
		int i, ans, x;
		for (i=0;i<str.length() ;i++)
		{ 
			 char ch = str.charAt(i);
			 System.out.print(ch);
		}
		
	}
}
