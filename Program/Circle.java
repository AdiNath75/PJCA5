class Circle 
{
	public static void main(String[] args) 
	{
		double rad = 12.34;
		double area = pi()*(rad*rad);
		System.out.println("The Area of Circle of radius "+rad+" is :"+area);
		double perimeter = 2*pi()*rad;
		System.out.println("Perimeter of Circle is :"+perimeter);
	}
	public static double pi()
	{
		double pi = 22.0/7.0;
		return pi;
	}
}
