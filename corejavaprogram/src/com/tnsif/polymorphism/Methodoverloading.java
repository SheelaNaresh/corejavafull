package com.tnsif.polymorphism;

public class Methodoverloading {
	
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverloading d=new Methodoverloading();
		System.out.println(d.add(5,6));
		System.out.println(d.add(1,2,3));
		

	}

}
