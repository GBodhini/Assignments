class SalesMan extends Employee
{
	private int points;
	public SalesMan() {}
	public SalesMan(int ssn,String name,int age,int empid, double salary, String orgname,int points) {
		super(ssn,name,age,empid,salary,orgname);
		this.points = points;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	

}
