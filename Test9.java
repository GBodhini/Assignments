class Test9
{
	public static void main(String[] args)
	{
		Person1 p1=new Person1(101,"Ajay",23);
		Student1 s1=new Student1(102,"Bodhini",21,06,9491,91.9,"A");
		PG PG1=new PG(103,"Sahith",19,"2046","Areospace");
		System.out.println("-----Person Details-----");
		System.out.println("ssn: " + p1.getSsn());
		System.out.println("Name: " + p1.getName());
		System.out.println("Age: " + p1.getAge());
		System.out.println("--------Student Details-------");
		System.out.println("ssn: " + s1.getSsn());
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("RollNo: " + s1.getRollNo());
		System.out.println("Phone Number: " + s1.getPhoneNumber());
		System.out.println("Percentage: " + s1.getPercentage());
		System.out.println("Grade: " + s1.getGrade());
		System.out.println("--------PG Student Details-------");
		System.out.println("ssn: " + PG1.getSsn());
		System.out.println("Name: " + PG1.getName());
		System.out.println("Age: " + PG1.getAge());
		System.out.println("year of Joining : " + PG1.getYearOfJoining());
		System.out.println("Course Name: " + PG1.getCoursename());
		
	}
}