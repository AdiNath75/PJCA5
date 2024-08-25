import java.util.Scanner;
class CharToNum
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any Character");
		char c1 = s.next().charAt(0);
		String st = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i;
		for ( i=0;i<st.length() ;i++ )
		{
			char ch = st.charAt(i);
			if (ch==c1)
			{
				System.out.println(i);
			}
		}	
	}
}
