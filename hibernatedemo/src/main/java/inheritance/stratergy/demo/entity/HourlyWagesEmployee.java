package inheritance.stratergy.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
//@DiscriminatorValue("HourlyWages")
public class HourlyWagesEmployee extends Employee
{
	@Column(name="no_hours")
	private int noOfHours;
	@Column(name="rate_hour")
	private double ratePerHour;
	public HourlyWagesEmployee() {}
	public HourlyWagesEmployee(int employeeId,String employeeName,int noOfHours, double ratePerHour) {
		super(employeeId,employeeName);
		this.noOfHours = noOfHours;
		this.ratePerHour = ratePerHour;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
}
