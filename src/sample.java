class sample{
	public static void main(String[] args){
		Student s= new Student(101,"Ajay",67,98,73);
		System.out.println("rollNumber:"+ s.rollNumber);
		System.out.println("Name:"+ s.name);	
		System.out.println("Total Marks: "+ s.totalMarks());
		System.out.println("Average: "+ s.average());
		System.out.println("Results: "+ s.results());
		System.out.println("Divison: "+ s.division());
	}
}
class Student{
	int rollNumber;
	String name;
	int sub1Marks;
	int sub2Marks;
	int sub3Marks;
	public Student(int rollNumber,String name,int sub1Marks,int sub2Marks,int sub3Marks)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		this.sub1Marks=sub1Marks;
		this.sub2Marks=sub2Marks;
		this.sub3Marks=sub3Marks;
	}
	public int totalMarks(){
		return sub1Marks+sub2Marks+sub3Marks;
	}
	public int average()	
	{
	 return (sub1Marks+sub2Marks+sub3Marks)/3;
	}
	public String results()
	{
		if(sub1Marks>=40 && sub2Marks>=40 && sub3Marks>=40)
			return "passed";
		return "Failed";
	}

	public String division()	
	{
		int avg=average();
		if(results().equals("passed"))
		{
			if(avg>=60)	
				return "First";
			else if(avg>=50)
				return "second";
			else	
				return "third";
			}
			return "NA";
                }
}







