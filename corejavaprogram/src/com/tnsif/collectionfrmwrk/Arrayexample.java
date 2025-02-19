package com.tnsif.collectionfrmwrk;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrayexample {
	public static void main(String[] args) {
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("hai");
		a2.add("hai");
		a2.add("hello");
		a2.add("hwru");
		
		Iterator itr=a2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
