package exam;

import java.util.ArrayList;

public class E05 {

	public static void main (String[] args) {
		ArrayList<String> myList= new ArrayList<String>();
		String[] myArray;
		try {
			while(true) {
				myList.add("My String");
			}
		}
		catch (RuntimeException re) {
			System.out.println("Caught a runtimeException");
		}
		
		catch(Exception e) {
			System.out.println("Caught an exception");
		}
		
		System.out.println("Ready to use");
		
	}
}
