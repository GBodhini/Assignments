package inheritance.stratergy.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@DiscriminatorColumn(name="emp_type")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
abstract public class Employee 
{
	@Id
	@Column(name="emp_id")
	private int employeeId;
	@Column(name="emp_name")
	private String employeeName;
	public Employee() {}
	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
}
