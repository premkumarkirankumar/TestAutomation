package polymorphism;

public class PClass5 extends PClass4{
	
	
	//This method Oveririding is called  runtime polymorphism
	@Override
	public void method1() {

		System.out.println("Executing Oveririding method 1");
	}

	
	public static void main ( String [] args) {

		PClass5 c= new PClass5();
		c.method1();
	}
}
