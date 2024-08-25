import java.util.Scanner;
class LowerCase
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st="AdiNAth AruN PURi";
		char ch[]=st.toCharArray();
		for (int i=0;i<ch.length ;i++ )
		{
			if (i==0 || ch[i]!=' ' && ch[i-1]==' ' || ch[i]<
			{
				if (ch[i]>='a' && ch[i]<='z');
					ch[i]=(char)(ch[i]-32);
			}
			else
			{
					if (ch[i]>='A' && ch[i]<='Z');
						ch[i]=(char)(ch[i]+32);
			}	
		}
		st = new String(ch);
		System.out.println(st);
	}
}
