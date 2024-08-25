import java.util.Scanner;
class StrCharCount 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.nextLine();
		int ac=0, dc=0, sc=0;
		for (int i=0;i<st.length() ;i++ )
		{
			char ch = st.charAt(i);
			if (ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				ac++;
			}
			else if (ch>='0' && ch<='9')
			{
				dc++;
			}
			else
				sc++;
		}
		System.out.println("Number of Alphabets are : "+ac);
		System.out.println("Number of digits are : "+dc);
		System.out.println("Number of Special Characters are : "+sc);
	}
}
