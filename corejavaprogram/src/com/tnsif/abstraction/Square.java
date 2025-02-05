package com.tnsif.abstraction;

public class Square extends Shape {
	
	protected float side;
	
	Square(){
		side=2.0f;
	}
	 
	Square(float s){
		this.side=s;
	}
	
	@Override
	void calarea() {
		// TODO Auto-generated method stub
		area=side*side;
	}
	

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Shape a=new Square();
		Shape a=new Square(5.0f);
		//Square a=new Square();
		
		System.out.println(a);
		a.calarea();
		a.show();

	}

	

}
