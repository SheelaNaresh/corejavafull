package com.tnsif.assignment.employees;

public class Employe {
	private String name;
	private int empid;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	
	
	
}
