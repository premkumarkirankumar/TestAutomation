package exam;

public class E19_2 extends E19_1 {
	
	public void test() {
		System.out.println("DerivedB ");
	}

	public static void main (String args[]) {
		E19_0 b1= new E19_2();
		E19_0 b2= new E19_1();
		E19_0 b3= new E19_2();
		b1.test();
		b2.test();
		
		b1=(E19_0) b3;
		E19_0 b4= (E19_1) b3;
		
		
		b1.test();
		b4.test();
		
	}
	
}
