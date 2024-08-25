class Forms 
{
	String name;
	long phno;
	String loc;
	String email;
	String DOB;
	long tele;
	boolean terms;
	String blood;
	String gender;

	{
		System.out.println("++++++++WELCOME+++++++++++");
		System.out.println("Enter all Mandatory fields*");
	}

	Forms(){}

	Forms(String name,long phno,String email,String DOB,boolean terms,String gender)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.DOB = DOB;
		this.terms = terms;
		this.gender = gender;
	}
	Forms(String name,long phno,String loc,String email,String DOB,boolean terms,String gender)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.DOB = DOB;
		this.terms = terms;
		this.gender = gender;
		this.loc = loc;
	}
	Forms(String name,long phno,String loc,String email,String DOB,long tele,boolean terms,String gender)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.DOB = DOB;
		this.terms = terms;
		this.gender = gender;
		this.loc = loc;
		this.tele = tele;
	}
	Forms(String name,long phno,String loc,String email,String DOB,long tele,boolean terms,String blood,String gender)
	{
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.DOB = DOB;
		this.terms = terms;
		this.gender = gender;
		this.loc = loc;
		this.tele = tele;
		this.blood = blood;
	}

	public void displayForms()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phno);
		System.out.println("Email : "+email);
		System.out.println("DOB : "+DOB);
		System.out.println("Acceptance to Terms : "+terms);
		System.out.println("Gender : "+gender);
		System.out.println("Location : "+loc);
		System.out.println("Telephone : "+tele);
		System.out.println("Blood Group : "+blood);
	}

}

