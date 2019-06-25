package encapsulation1;

public class EClass13 {
		
	public static void main( String[] args) {
		
		//EClass13 ob= new EClass13();// there are not methods in the current class
		EClass12 ob= new EClass12(); // creating the instance of the class where the methods are declared
		
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
