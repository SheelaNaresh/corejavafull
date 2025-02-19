package com.tnsif.collectionfrmwrk;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetdemo {

	public static void operations() {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(5);
		t.add(66);
		t.add(55);
		t.add(89);
		t.add(5);
		//t.add(null)
		System.out.println(t);
		
		Iterator i=t.iterator();	
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}
	public static void main(String[] args) {
		Treesetdemo.operations();
		
	}

}
