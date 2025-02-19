package com.tnsif.ExceptionS;

import java.io.IOException;

public class Throwsdemo {
	void m1() {
		System.out.println("hai");
	}
	void m2() throws IOException {
		throw new ArithmeticException("you are not eligible");
		
		//System.out.println("hello");
	}
	void m3() throws ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException {
		System.out.println("handsome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Throwsdemo t=new Throwsdemo();
		                                                                                           
		t.m1();
		try {
		t.m2();
		t.m3();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
