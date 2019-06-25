package encapsulation1;

public class EClass12 {
	
	String text1="Allegis";
	public String text2="Tek";
	protected String text3="Mla";
	private String text4="Msu";
	
	void method1() {
		
		System.out.println("Executing a default method 1");
	}
	
	public void method2() {
		
		System.out.println("Executing a public method 2");
	}
	
	protected void method3() {
		
		System.out.println("Executing a protected method 3");
	
	}
	
	private void method4() {
		
		System.out.println("Executing a private method 4");
	}

	
	public static void main( String[] args) {
		
		EClass12 ob= new EClass12();
		System.out.println(ob.text1);
		System.out.println(ob.text2);
		System.out.println(ob.text3);
		System.out.println(ob.text4);
		ob.method1();
		ob.method2();
		ob.method3();
		ob.method4();		
	}
}
