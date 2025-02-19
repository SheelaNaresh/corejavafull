package com.tnsif.ExceptionS;

public class Test1 {
	
	public void hai() {
		try {
			System.out.println("hai");
		}
		catch(Exception e ) {
			System.out.println("hello");
		}
		finally {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t=new Test1();
		t.hai();
	}

}
