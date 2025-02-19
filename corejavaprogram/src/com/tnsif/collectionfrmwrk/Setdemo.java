package com.tnsif.collectionfrmwrk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setdemo {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(2);
		s.add(24);
		s.add(25);
		s.add(26);
		
		System.out.println(s);
		s.addAll(Arrays.asList(new Integer[]  {1,3,5}));
//		System.out.println(s);
		for(int i:s) {
			System.out.println(i);
		}
		
		Set<Integer> t=new HashSet<Integer>();
		t.addAll(Arrays.asList(new Integer[]  {5,6,7}));
		System.out.println(t);
		
		
		//intersection
		Set<Integer> intersection=new HashSet<Integer>(s);
		intersection.retainAll(t);
		System.out.println(intersection);
		
		//union
		Set<Integer> union=new HashSet<Integer>(s);
		union.addAll(t);
		System.out.println(union);
		
		
		
		
		
		
		
	
	}

}
