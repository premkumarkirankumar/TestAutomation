package encapsulation2;

import encapsulation1.EClass12;

public class EClass16 {
	
	public static void main( String[] args) {
		
		// Import EClass12 from other package by instantiating the class
		// Except public , no other access modifiers are available
		
		EClass12 ob= new EClass12(); 
		//System.out.println(ob.text1);
		System.out.println(ob.text2);
		//System.out.println(ob.text3);
		//System.out.println(ob.text4);
		//ob.method1();
		ob.method2();
		//ob.method3();
		//ob.method4();		
	}

}
