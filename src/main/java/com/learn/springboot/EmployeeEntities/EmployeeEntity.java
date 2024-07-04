package com.learn.springboot.EmployeeEntities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	
	@Id
	String empid;
	String empname;
	float salary;
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(String empid, String empname, float salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	

}
