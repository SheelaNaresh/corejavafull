package com.tnsif.assignment.employees;

public class Manager extends Employe{
	private String devopname="naresh";
	
	public static void main(String[] args) {
//		Manager m=new Manager();
		Employe e=new Employe();
		e.setName("accenture");
		e.setEmpid(90);
		e.setSalary(90000);
		
		System.out.println(e);
		
	}

	

}
