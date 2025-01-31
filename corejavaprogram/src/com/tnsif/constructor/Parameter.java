package com.tnsif.constructor;

public class Parameter {
	Parameter(){
		System.out.println("default constructor is called");
	}
	Parameter(int a){
		System.out.println("parameter constructor is called with 1 parameter");
	}
	Parameter(int a,String b){
		System.out.println("parameter constructor is called with 2 parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Parameter x=new  Parameter();
		 Parameter y=new  Parameter(57);
		 Parameter z=new  Parameter(57,"naresh");
		 
		

	}

}
