class Redmi 
{
	int memory;
	double price;
	String processor;
	int camera;
	int battery;

	Redmi(){}

	Redmi(double price, int camera, int battery)
	{
		this();
		this.price = price;
		this.camera = camera;
		this.battery = battery;
	}
	
	Redmi(int memory, double price, int camera, String processor, int battery)
	{
		this(price,camera,battery);
		this.memory = memory;
		this.camera = camera;
		this.processor = processor;
	}

	public void displayRedmi()
	{
		System.out.println("Memory : "+memory);
		System.out.println("Price : "+price);
		System.out.println("Camera : "+camera);
		System.out.println("Processor : "+processor);
		System.out.println("Battery : "+battery);
	}
}