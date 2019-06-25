package examples;

public class Example4 {
	
	String msg;
	
	Example4(String msg) {
		this.msg= msg;
	}
	
	public static void main(String [] args) {
		System.out.println("Helllo "+ new StringBuilder("Java Se 8"));
		System.out.println("Helllo "+ new Example4("Java Se 8"));
	}

}
