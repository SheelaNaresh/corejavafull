package com.tnsif.ExceptionS;

public class WithException {
	public static void main(String[] args) {
		try {
			int a=6/0;
			System.out.println("hai");
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("Exception caught"+e.getMessage());
			System.out.println("hello");
		}	
	}
	

}
