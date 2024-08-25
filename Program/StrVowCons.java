import java.util.Scanner;
class StrVowCons 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String st = s.nextLine();
		int uc=0, lc=0, vc=0, cc=0;
		for (int i=0;i<st.length() ;i++ )
		{
			char ch = st.charAt(i);
			if (ch>='A' && ch<='Z')
			{
				if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				{
					vc++;
				}
				else
				{
					cc++;
				}
				uc++;
			}
			if (ch>='a' && ch<='z')
			{
				if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vc++;
				}
				else
				{
					cc++;
				}
				lc++;
			}
		}
		System.out.println("Number of Vowels: "+vc);
		System.out.println("Number of Consonent : "+cc);
		System.out.println("Number of Capital letters:"+uc);
		System.out.println("Number of Small letters: "+lc);
		
		
	}
}
