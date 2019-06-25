package examples;

public class Example33 {
	
	char c;
	boolean b;
	float f;
	
	int count;
	
	 void printAll() {
		
		System.out.println("c="+c);
		System.out.println("b="+b);
		System.out.println("f="+f);
	}
	 
	 public static void displayMS() {
		// count++; need to be static
	 }
	
	public static void main(String [] args) {
		
		 Example33 f= new Example33();
		 f.printAll();
	}

}
