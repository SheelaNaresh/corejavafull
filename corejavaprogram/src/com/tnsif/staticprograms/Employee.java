package com.tnsif.staticprograms;

public class Employee {
	int eid;
	String name;
	static String company="TCS";
	
	Employee(int r,String n){
		eid=r;
		name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+company);
	}
	
	public static void main(String[] args) {
		
		Employee e1 =new Employee(57,"naresh");
		Employee e2 =new Employee(67,"nnnnnnn");
		
		e1.display();
		e2.display();
		
		
	}

}
