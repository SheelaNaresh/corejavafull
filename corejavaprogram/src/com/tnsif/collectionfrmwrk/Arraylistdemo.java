package com.tnsif.collectionfrmwrk;

import java.util.ArrayList;

public class Arraylistdemo {
	public static void main(String[] args) {
		//ArrayList a1=new ArrayList();
		ArrayList<String> a1=new ArrayList<String>();
		
		//add the elements
		
//	a1.add("shush");
//	a1.add(8);
//	a1.add(9.5f);
//	a1.add('h');
		a1.add("hai");
		a1.add("hello");
		a1.add("hw r u");
	
	System.out.println(a1);
	System.out.println("size :"+a1.size());
	
	System.out.println(a1.contains(5));
	System.out.println(a1.contains("hello"));
	
	System.out.println(a1.isEmpty());
	System.out.println(a1.remove(0));
	System.out.println(a1);
	}

}
