package com.tnsif.collectionfrmwrk;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		//LinkedList l=new LinkedList();
		
		LinkedList<String> li=new LinkedList<String>();
		li.add("raghu");
		li.add("sohan");
		li.add("rohan");
		System.out.println("after invoking add :"+li);
		li.add(1,"sangeetha");
		System.out.println(li);
		LinkedList<String> l=new LinkedList<String>();
		l.add("lohith");
		l.add("naresh");
		System.out.println(l);
		l.addAll(li);
		System.out.println("after adding lists :"+l);
		l.remove("rohan");
		System.out.println(l);
		System.out.println(li);
	}

}
