class Test2
{
	public static void main(String[] args)
	{
		Employee e=new Employee(7001,"Ajay Sahith",26,5678,75000,"ABC Corp");
		System.out.println("ssn: "+ e.getSsn());
		System.out.println("Name: "+ e.getName());
		System.out.println("Age: "+ e.getAge());
		System.out.println("Empid: "+ e.getEmpid());
		System.out.println("Salary: "+ e.getSalary());
		System.out.println("Orgname: "+ e.getOrgname());
	}
}