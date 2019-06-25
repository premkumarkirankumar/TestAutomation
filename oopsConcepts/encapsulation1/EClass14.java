package encapsulation1;

public class EClass14 extends EClass12 {
	
	public static void main( String[] args) {
		
		// Now we are extending from EClass12 so we can use the current class as instantiation
		EClass14 ob= new EClass14();
		System.out.println(ob.text1);
		System.out.println(ob.text2);
		System.out.println(ob.text3);
		//System.out.println(ob.text4);
		ob.method1();
		ob.method2();
		ob.method3();
		//ob.method4();		
			
	}
	

}
