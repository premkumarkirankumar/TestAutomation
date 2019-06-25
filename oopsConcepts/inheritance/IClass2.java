package inheritance;

public class IClass2 extends IClass1{
	
	public static void main ( String [] args) {
		
		IClass2 c= new IClass2();

		c.method1();
		c.method2();
		System.out.println(c.method3());
		System.out.println(c.number);
		System.out.println(c.text);
		c.method4();
	}
	
	public void method4() {

		// code
		// code
		System.out.println("Executing method 4");

	}

}
