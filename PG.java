class PG extends Person1
{
	private String yearOfJoining;
	private  String coursename;
	public PG() {}
	public PG(int ssn, String name, int age,String yearOfJoining, String coursename) {
		super(ssn,name,age);
		this.yearOfJoining = yearOfJoining;
		this.coursename = coursename;
	}
	public String getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	
}