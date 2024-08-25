class Chair 
{
	int legs;
	String colour;
	double price;

	Chair()
	{
		
	}

	Chair(int legs,String colour,double price)
	{
		this.legs = legs;
		this.colour = colour;
		this.price = price;
	}

	public void displayChair()
	{
		System.out.println("No. of Legs : "+legs);
		System.out.println("Colour : "+colour);
		System.out.println("Price : "+price);
		System.out.println("**************************");
	}
}
