class Student1 extends Person1
{
	private int RollNo;
	private int PhoneNumber;
	private double Percentage;
	private String Grade;
	public Student1() {}
	public Student1(int ssn, String name, int age,int rollNo, int phoneNumber, double percentage, String grade) {
		super(ssn,name,age);
		RollNo = rollNo;
		PhoneNumber = phoneNumber;
		Percentage = percentage;
		Grade = grade;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
	
	
	
}
