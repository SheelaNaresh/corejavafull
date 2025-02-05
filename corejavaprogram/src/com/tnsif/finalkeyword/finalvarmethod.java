package com.tnsif.finalkeyword;

public class finalvarmethod {
	
	final int a=5;
	final static int b;
	
	static {
		b=7;
		
	}
	// a=6;  shows error

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(finalvarmethod.b);

	}

}
