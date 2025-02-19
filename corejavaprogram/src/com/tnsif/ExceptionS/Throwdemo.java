package com.tnsif.ExceptionS;

public class Throwdemo {
	public void vote(int age) {
		try {
		if(age<18)
		{
			throw new ArithmeticException("you are not eligible");
		}
		
		else {
			System.out.println("you are eligible");
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throwdemo d=new Throwdemo();
		d.vote(15);
		

	}

}
