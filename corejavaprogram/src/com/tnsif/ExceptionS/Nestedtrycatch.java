package com.tnsif.ExceptionS;

public class Nestedtrycatch {
	
	public static void add() {
		String str="TNS";
		int slength=str.length();
	System.out.println("length of str is:"+slength);
	
	String anotherstring=null;
	int y=6;
	try {
	try {
		System.out.println(str.charAt(y));
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println(" string index exception: "+e.getMessage());
	}
	System.out.println(anotherstring.length());
	}
	catch(NullPointerException f) {
		System.out.println("null pointer exception is found :"+f.getMessage());
	}
	}

}
