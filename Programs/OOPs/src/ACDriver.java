class ACDriver 
{
	public static void main(String[] args) 
	{
		AirConditioner A1 = new AirConditioner("Voltas", 20000,"White",2,16,35,20);

		A1.displayDetails();
		A1.displayMaxTemp();
		A1.displayMinTemp();
		A1.displayAmbientTemp();
	}
}
