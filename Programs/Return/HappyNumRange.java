import java.util.Scanner;
class HappyNumRange
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First number");
		int start = s.nextInt();
		System.out.println("Enter Second number");
		int end = s.nextInt();
		for (int i=start;i<=end ;i++ )
		{
			happyNum(i);
		}
	}
	public static void happyNum(int n)
	{
        int num, sum = 0;
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                int r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println(n);
        }
	}
}