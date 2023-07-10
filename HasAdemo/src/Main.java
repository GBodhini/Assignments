import com.bodh.model.Address;
import com.bodh.model.Department;
import com.bodh.model.Employee1;


public class Main
{
	public static void main(String[] args)
	{
		Employee1[] elist= new Employee1[3];
		elist[0]=new Employee1(102,"Ajay",2000,new Address("7-8-6","MG Road","Banglore","Karnataka"));
		elist[1]=new Employee1(103,"Bodhini",3000,new Address("1-2-3","Anna Road","Manglore","Karnataka"));
		elist[2]=new Employee1(101,"Sahith",4000,new Address("4-5-9","Bank Road","Mumbai","Maharastra"));
		Department d= new Department(10,"Sales","Goa",elist);
		System.out.println("--------Department Details-------");
		System.out.println("Department Number : " + d.getDepartmentNo());
		System.out.println("Department Name : " + d.getName());
		System.out.println("Department Loaction : " + d.getLocation());
		for(Employee1 e: elist)
		{
			System.out.println("Employee id: "+ e.getEmployeeId());
			System.out.println("Employee Name: "+ e.getEmployeeName());
			System.out.println("Salary: "+ e.getSalary());
			System.out.println("-------Address------");
			System.out.println("HNo : "+ e.getAddress().getHno());
			System.out.println("Street: "+ e.getAddress().getStreet());
			System.out.println("city: "+ e.getAddress().getCity());
			System.out.println("Street: "+ e.getAddress().getState());
		}
		
	}
}









		/*Employee1 e=new Employee1(7001,"Ajay",75600,new Address("1-2-3","MG Street","Banglore","Karnataka"));
		System.out.println("Employee id: "+ e.getEmployeeId());
		System.out.println("Employee Name: "+ e.getEmployeeName());
		System.out.println("Salary: "+ e.getSalary());
		System.out.println("-------Address------");
		System.out.println("HNo : "+ e.getAddress().getHno());
		System.out.println("Street: "+ e.getAddress().getStreet());
		System.out.println("city: "+ e.getAddress().getCity());
		System.out.println("Street: "+ e.getAddress().getState());*/
		
