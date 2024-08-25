class BikeDriver 
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike("YAHAMA","MT-15",149000,"Ice fluo Vermillion",155,130,10,55.2,48.5);
		
		b1.displayDetails();
		b1.displayHighwayMileage();
		b1.displayCityMileage();
	}
}
