package com.tnsif.comparabledemo;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		
		int size=v.size();
		System.out.println(size);
		v.add("hai");
		v.add("hello");
		v.add("hw");
		
		int size1=v.capacity();
		System.out.println(size1);
		v.add("hq");
		v.add("hw");
		v.add("he");
		v.add("hr");
		v.add("ht");
		v.add("hy");
		v.add("hu");
		v.add("ho");
		int size2=v.capacity();
		System.out.println(size2);
		
		
	}

}
