package com.tnsif.superkeyword;

public class Childdemo extends Parentdemo {
	int a=8;
	
	 void drink() {
		System.out.println("child drink");
	}
	 
	 void display() {
		 System.out.println(a);
		 System.out.println(super.a);
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childdemo d=new Childdemo();
		d.drink();
		d.display();
		

	}

}
