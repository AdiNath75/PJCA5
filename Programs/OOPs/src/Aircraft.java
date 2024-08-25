class  Aircraft
{
	String name;
	int no_of_engines ;
	double speed ;
	String type;
	double load;

	Aircraft()
	{

	}

	Aircraft(String name, int engines, double speed, String type, double load)
	{
		this.name = name;
		no_of_engines = engines;
		this.speed = speed;
		this.type = type;
		this.load = load;
	}
	
	public void displayAircraft()
	{
		System.out.println("Name : "+name);
		System.out.println("Number of Engines : "+no_of_engines);
		System.out.println("Speed : "+speed);
		System.out.println("Type : "+type);
		System.out.println("Load : "+load);
	}
}

