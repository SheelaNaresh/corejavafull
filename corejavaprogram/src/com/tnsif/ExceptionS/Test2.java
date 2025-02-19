package com.tnsif.ExceptionS;

public class Test2 {
	public void hai() {
		try {
			System.out.println(100/0);
		}
		catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 t=new Test2();
		t.hai();
		
	}

}
