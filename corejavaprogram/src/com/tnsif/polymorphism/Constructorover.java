package com.tnsif.polymorphism;

public class Constructorover {
	
	private float x;
	private float y;
	
	public Constructorover() {
		this.x=0.5f;
		this.y=0.4f;
		System.out.println(x+y);
	}
	
	public Constructorover(float x) {
		
		this.y=0.4f;
		System.out.println(x+y);
		
	}
public Constructorover(float x,float y) {
		
		this.y=y;
		this.x=x;
		System.out.println(x+y);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructorover c =new Constructorover();
		Constructorover d =new Constructorover(0.6f);
		Constructorover e =new Constructorover(0.1f,0.2f);
		

	}

}
