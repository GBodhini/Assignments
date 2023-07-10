class Test2
{
	public static void main(String[] args)
	{
		Employee e=new Employee(7001,"Ajay Sahith",26,5678,75000,"ABC Corp");
		SalesMan s= new SalesMan(7002,"Bodhini",23,5679,60000,"Prolifics",10);
		System.out.println("ssn: "+ e.getSsn());
		System.out.println("Name: "+ e.getName());
		System.out.println("Age: "+ e.getAge());
		System.out.println("Empid: "+ e.getEmpid());
		System.out.println("Salary: "+ e.getSalary());
		System.out.println("Orgname: "+ e.getOrgname());
		System.out.println("Sales Man");
		System.out.println("ssn: "+ s.getSsn());
		System.out.println("Name: "+ s.getName());
		System.out.println("Age: "+ s.getAge());
		System.out.println("Empid: "+ s.getEmpid());
		System.out.println("Salary: "+ s.getSalary());
		System.out.println("Orgname: "+ s.getOrgname());
		System.out.println("points: "+ s.getPoints());
		System.out.println("Incentives: "+ s.getPoints()*750);
		System.out.println("Total Salary: "+ (s.getSalary()+s.getPoints()*750));
		
	}
}