package com.tnsif.ExceptionS;

public class Divison {
	public static void divide() {
		int a=5,b=0,c;
		
		try {
			System.out.println("hai");
			c=a/b;
		}
		catch(ArrayIndexOutOfBoundsException d) {
			System.out.println("Exception caught"+d.getMessage());
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception caught"+e.getMessage());
			
		}
		catch(ArithmeticException f){
			//System.out.println(e);
			System.out.println("Exception caught f "+f.getMessage());
		}	
		
//		catch(Exception g) {
//			System.out.println("Exception caught g "+g.getMessage());
//			
//		}
		
		
	}

}
