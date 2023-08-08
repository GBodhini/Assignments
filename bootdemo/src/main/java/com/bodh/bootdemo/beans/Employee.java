package com.bodh.bootdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
	private int ssn=165;
	private String name="Bodhini";
	private String mobile="75897385";
	private int age=21;
	private String gender="Female";
	@Autowired
	Department department;
	public Employee() {}
	public Employee(int ssn, String name, String mobile, int age, String gender, Department department) {
		this.ssn = ssn;
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
