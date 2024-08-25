class AircraftDriver 
{
	public static void main(String[] args) 
	{
		Aircraft a1 = new Aircraft("Rafale",2,2,"Fighter",10);

		a1.displayAircraft();

		Aircraft a2 = new Aircraft("MIG",2,2.5,"Fighter",8);

		a2.displayAircraft();
	}
}
