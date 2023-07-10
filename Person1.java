class Person1{
	private int Ssn;
	private String name;
	private int age;
	public Person1() {}
	public Person1(int ssn, String name, int age) {
		Ssn = ssn;
		this.name = name;
		this.age = age;
	}
	public int getSsn() {
		return Ssn;
	}
	public void setSsn(int ssn) {
		Ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}