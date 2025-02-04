package com.tnsif.staticprograms;

public class staticmethod {
	
	int roll;
	String name;
	static String clg="TKR";
	
	static void change() {
		clg="TKEM";
	}
	
	 staticmethod(int r,String n){
		 roll=r;
		 name=n;
	 }
	 
	 void display() {
			System.out.println(roll+" "+name+" "+clg);
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticmethod c1=new staticmethod(1,"naresh");
		c1.display();
		staticmethod.change();
		c1.display();
		
		

	}

}
