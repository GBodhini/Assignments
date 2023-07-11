import com.bodh.model.Address;
import com.bodh.model.Company;
import com.bodh.model.Department;
import com.bodh.model.Employee1;


public class Main
{
	public static void main(String[] args)
	{
		Employee1[] elist1= new Employee1[3];
		elist1[0]=new Employee1(102,"Ajay",2000,new Address("7-8-6","MG Road","Banglore","Karnataka"));
		elist1[1]=new Employee1(103,"Bodhini",3000,new Address("1-2-3","Anna Road","Manglore","Karnataka"));
		elist1[2]=new Employee1(101,"Sahith",4000,new Address("4-5-9","Bank Road","Mumbai","Maharastra"));
	
		Employee1[] elist2= {new Employee1(104,"Dinesh",4000,new Address("4-4-4","Temple Street","Vijayawada","AP")),
				new Employee1(104,"Eshwar",4000,new Address("4-4-4","Temple Street","Vijayawada","AP")),
				new Employee1(104,"Jon Miller",4000,new Address("4-4-4","Temple Street","Vijayawada","AP"))};
		
		Company c=new Company("Abc","New York",new Department[] {
				new Department(10,"Sales","Hyderabad",elist1),
				new Department(11,"Marketing","Banglore",elist2),
		});
		
		System.out.println("Company Name:" + c.getCompanyName());
		System.out.println("Company Location "+ c.getLocation());
		System.out.println("--------Departments------");
		for(Department d:c.getDepartments())
		{
			System.out.println(d.getDepartmentNo()+" "+d.getName()+" "+d.getLocation());
				for(Employee1 e:d.getEmployees())
				{
					System.out.println("\t"+e.getEmployeeId());
					System.out.println("\t"+e.getEmployeeName());
					System.out.println("\t"+e.getSalary());
					System.out.println("\t"+e.getAddress().getHno());
					System.out.println("\t"+e.getAddress().getStreet());
					System.out.println("\t"+e.getAddress().getCity());
					System.out.println("\t"+e.getAddress().getState());
					
				}
		}
		
		
		
	}
}
		
		
		
		
		
		
		/*Department d= new Department(10,"Sales","Goa",elist);
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










		Employee1 e=new Employee1(7001,"Ajay",75600,new Address("1-2-3","MG Street","Banglore","Karnataka"));
		System.out.println("Employee id: "+ e.getEmployeeId());
		System.out.println("Employee Name: "+ e.getEmployeeName());
		System.out.println("Salary: "+ e.getSalary());
		System.out.println("-------Address------");
		System.out.println("HNo : "+ e.getAddress().getHno());
		System.out.println("Street: "+ e.getAddress().getStreet());
		System.out.println("city: "+ e.getAddress().getCity());
		System.out.println("Street: "+ e.getAddress().getState());*/
		
