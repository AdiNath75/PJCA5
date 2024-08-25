class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
	
		 s1.detailStudent("Adi", 75 , "EEP").displayStudent();

		System.out.println(s1);

		Student s2 = new Student();

		s2.detailStudent("Nath", 44 ,"E&TC").displayStudent();

		System.out.println(s2);

		Student s3 = new Student();

		s3.detailStudent("Abc", 45, "CS").displayStudent();

		System.out.println(s3);
	}
}
