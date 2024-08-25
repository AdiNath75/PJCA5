class Bike 
{
	String companyname;
	String model;
	double price;
	String varient;
	int engine;
	int topspeed;
	int tankcapacity;
	double highwaymileage;
	double citymileage;

	Bike()
	{

	}

	Bike(String company, String model, double price, String varient,int engine, int speed, int capacity,double highway, double city)
	{
		companyname = company;
		this.model = model;
		this.price = price;
		this.varient = varient;
		this.engine = engine;
		topspeed = speed;
		tankcapacity = capacity;
		highwaymileage  =  highway;
		citymileage = city;
	}
	public void displayDetails()
	{
		System.out.println("Company Name : "+companyname);
		System.out.println("Model name : "+model);
		System.out.println("Varient : " +varient);
		System.out.println("Price : " +price+" Rs");
		System.out.println("Engine : "+engine+"cc");
		System.out.println("Fuel Tank Capacity : "+tankcapacity+"Ltr");
		System.out.println("Top Speed : "+topspeed+"km/h");
		System.out.println("Price : "+price+"Rs");
	}
	public void displayHighwayMileage()
	{
		System.out.println("Highway Mileage : "+highwaymileage+"Kmpl");
	}
	public void displayCityMileage()
	{
		System.out.println("City Mileage : "+citymileage+"Kmph");
	}

}
