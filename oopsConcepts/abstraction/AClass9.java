package abstraction;

public class AClass9 extends AClass8  {
	
	public static void main (String [] args) {
				
		AClass9 c= new AClass9();
		c.abstractMethod1();
		c.method2();
		c.method3();
				
	}

	@Override
	void abstractMethod1() {
		// TODO Auto-generated method stub
		
		System.out.println("Executing Abstract method 1");
		
	}

}
