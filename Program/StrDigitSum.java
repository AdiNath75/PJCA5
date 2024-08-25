import java.util.Scanner;
class StrDigitSum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.nextLine();
		int sum=0;
		for (int i=0;i<st.length() ;i++ )
		{
			char ch = st.charAt(i);
			if (ch>='0' && ch<='9')
			{
				sum=sum+ch-48;
			}
		}
		System.out.println("Sum of Digits in String is : "+sum);
	}
}
