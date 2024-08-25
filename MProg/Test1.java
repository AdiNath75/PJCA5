
class Test1 {

	static int finalCount(int n,int x)
	{
		int count = 0;
		int y = n-x;
		while (x!=y)
		{
			if (x>y) {
				x=x-y;
			}
			else if(y>x) {
				y=y-x;
			}
			count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int n = 9;
		int x = 10;
		System.out.println(finalCount(n,x));	
	}
}
