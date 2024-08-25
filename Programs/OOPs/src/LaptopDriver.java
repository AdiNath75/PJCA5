class  LaptopDriver
{
	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop("HP","i5",8,15.0,45000);

		l1.displayLaptop();
		
		Laptop l2 = new Laptop("Lenovo", "i7",4,15.5,35000);

		l2.displayLaptop();

		Laptop l3 = new Laptop("MAC","M1",3,13.5,100000);

		l3.displayLaptop();

		Laptop l4 = null;
		System.out.println(l4);

	}
}
