package polymorphism;

public class PClass6 {

	
	public void method2(int a, String text) {

		System.out.println("Output number: "+a+"\nOutput text: "+text);
		System.out.println("\n");
	}
	
	
	//method overloading
	public void method2 (int a, int b) {
		
		System.out.println("Multiply :"+a*b);
		System.out.println("Sum :"+a+b); // Need to be careful while adding two int
		System.out.println("Sum :"+(a+b));
		System.out.println("Subtract:"+(a-b));
		System.out.println("Divide:"+(a/b));
		System.out.println("\n");
		
	}
	
	//method overloading
	public void method2( String text) {
		
		System.out.println("This is called method overloading or Compile time polymorphism");
		System.out.println("Parameterized text: "+text);
		System.out.println("\n");
	}

}
