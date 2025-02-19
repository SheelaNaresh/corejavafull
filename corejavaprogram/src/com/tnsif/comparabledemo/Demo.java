
package com.tnsif.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Laptop> l=new ArrayList<Laptop>();
		l.add(new Laptop("dell",50000,8));
		l.add(new Laptop("apple",80000,9));
		l.add(new Laptop("hp",20000,3));
		
		Collections.sort(l);
		for(Laptop i:l) {
			System.out.println(i);
		}
		
	}

}
