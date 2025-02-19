package com.tnsif.collectionfrmwrk;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<Integer>();
		ob.push(5);
		ob.push(66);
		ob.push(77);
		ob.push(88);
		
		System.out.println(ob);
		System.out.println(ob.size());
		
		System.out.println(ob.peek());
		
		if(ob.isEmpty())
			System.out.println("stcak is empty");
		else
			System.out.println("stack is not empty");
		
		System.out.println(ob.search(88));
		System.out.println(ob.search(1));
		
		ob.pop();
		System.out.println(ob);
		System.out.println(ob.getFirst());
		System.out.println(ob.firstElement());
		
		
		
		

	}

}
