import java.util.Scanner;
class BinToOct {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
				int num = s.nextInt();
				int ans = binToOct(num);
				System.out.println(ans);
			}
		public static int count(int num)
		{
			int count = 0;
			for (int i=num;i>0;i/=10)
			{
				int rem =i/10;
				count++;
			}
			return count;
		}
		public static int pow(int n,int p)
		{
			int pow = 1;
			for(int i=p;i>0;i--)
			{
				pow = pow*n;
			}
			return pow;
		}
		public static int binToOct(int num)
		{
			int count = count(num);
			int oct = 0;
			for(int i=0;i<count;i++)
			{
				int rem = num%10;
				oct = oct*10+(rem*pow(2,i));
			}
			return oct;
		}
}