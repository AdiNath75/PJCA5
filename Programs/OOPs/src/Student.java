class Student 
{
	String name ;
	int roll ;
	String dept ;
	String school = "Qspiders";
	{
		System.out.println("Welcome to Qspiders");
	}
	public Student detailStudent(String name,int roll, String dept)
	{
		this.name = name;
		this.roll = roll ;
		this.dept = dept ;
		return this;
	}
	public void displayStudent()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+roll);
		System.out.println("Department : "+dept);
		System.out.println("School name : "+school);
		System.out.println("Admission Successful");
	}
	
}
