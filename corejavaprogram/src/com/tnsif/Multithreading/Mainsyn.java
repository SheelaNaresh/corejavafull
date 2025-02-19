package com.tnsif.Multithreading;

public class Mainsyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Examplesyn e=new 	Examplesyn();
		
		Tsyn t=new Tsyn();
		Tsyn t1=new Tsyn();
		Tsyn t2=new Tsyn();
		
		t.start();
		t1.start();
		t2.start();
		

	}

}
