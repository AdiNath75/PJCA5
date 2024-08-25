import java.util.*;
class GFGC
{   
    static int MAX = 26;
    static void compressString(String s, int n)
    {
        int freq[] = new int[MAX] ;
        for (int i = 0; i < n; i++)
			{
				freq[s.charAt(i) - 'a']++;
			}
        for (int i = 0; i < MAX; i++)
        {
            if (freq[i] == 0)
                continue;
            System.out.print((char)(i + 'a') +""+ freq[i]);
        }
    }
	public static void main (String[] args)
    {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
     
        compressString(s, n);
    }
}