package com.tnsif.ExceptionS;

public class Test3 {
	
	public void hai() {
		try {
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test3 t=new Test3();
		t.hai();

	}

}
