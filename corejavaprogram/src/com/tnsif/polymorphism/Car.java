package com.tnsif.polymorphism;

public class Car extends vechile {
	
	void move() {
		System.out.println("child class");
	}
	
	void display(){
		move();
		super.move();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c=new Car();
		c.move();
		c.display();

	}

}
