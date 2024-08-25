import java.util.Scanner;
class  CompoundInterest
{
	public static double compIntr(double p, double r, double n, double t)
	{
		double x = xI(r,n);
		double y = yI(n,t);
		double z = pow(x,y);
		double ci = p*(pow(x,y))-p;
		return ci;
	}
	public static double xI(double r, double n)
	{
		double x = 1+(r/n);
		return x;
	}
	public static double yI(double n, double t)
	{
		double y = n*t;
		return y;
	}
	public static double pow(double x, double y)
	{
		double pow = 1;
		for (double d=y;d>0 ;d-- )
		{
			pow = pow*x;
		}
		return pow;
	}
	public static double simpleIntr(double p, double r, double t)
	{
		double si = p*(1+r*t);
		return si;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Principle Ammount");
		double p = s.nextDouble();
		System.out.println("Enter Annual interest rate");
		double r = s.nextDouble();
		System.out.println("Enter number of times interest applied per unit t");
		double n = s.nextDouble();
		System.out.println("Enter the Time in Years");
		double t = s.nextDouble();
		double ci = compIntr(p,r,n,t);
		System.out.println("Compount Interest is : "+ci);
		double si = simpleIntr(p,r,t);
		System.out.println("Simple Interest is :"+si);
	}
}
