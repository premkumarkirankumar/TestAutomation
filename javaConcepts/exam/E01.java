package exam;

import java.util.ArrayList;

public class E01 {
	
	public static void main(String [] args) {
		
		ArrayList<String> colors= new ArrayList<String>();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3, "cyan");
		
		System.out.println(colors);
		
	}
	


}
