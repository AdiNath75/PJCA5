import java.util.Scanner;
class  DuplicateArr
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("Enter" +n+" values");
		for (int i=0;i<n ;i++ )
		{
			ar[i]=s.nextInt();
		}
		int br[]=ar;
		int cr[]=new int[ar.length];
		for (int i=0;i<ar.length ;i++ )
		{
			cr[i]=ar[i];
			System.out.println(cr[i]);
		}
		
	}
}
