package com.bodh.model;
public class Company
{
	private String companyName;
	private String Location;
	private Department[] departments;
	public Company() {}
	public Company(String companyName, String location, Department[] departments) {
		this.companyName = companyName;
		this.Location  = location;
		this.departments = departments;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Department[] getDepartments() {
		return departments;
	}
	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

	
	
	
}
