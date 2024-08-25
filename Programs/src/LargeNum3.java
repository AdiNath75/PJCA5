class LargeNum3 
{
	public static void main(String[] args) 
	{
		int a = 30;
		int b = 60;
		int c = 90;
		int res = c>(a>b?a:b)?c:(a>b?a:b) ;
		int ans = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("The Largest Number is:"+res);
		System.out.println("The largest number of "+a+","+b+","+c+" is:" +ans);
	}
}
