package exam1;

import exam.E16;

public class E16_1 extends E16 {
	
	public static void main (String [] args) {
		
		E16 obj= new E16_1();
		obj.s=6; // cannot access protected
		
		E16_1 obj1= new E16_1();
		obj1.r=5; // can access protected
		obj1.s=7;
		
	}

}
