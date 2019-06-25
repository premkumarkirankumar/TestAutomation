package encapsulation2;

import encapsulation1.EClass12;

public class EClass17 extends EClass12 {

	public static void main( String[] args) {
		
		//import EClass12 from other package by extending the class
		//Except public & Protected , no other access modifiers are available
		

		EClass17 ob= new EClass17();
		//System.out.println(ob.text1);
		System.out.println(ob.text2);
		System.out.println(ob.text3);
		//System.out.println(ob.text4);
		//ob.method1();
		ob.method2();
		ob.method3();
		//ob.method4();		
	}
}


