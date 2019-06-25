package exam1;

import exam.*;

//import static exam.E07.getcolor;

//import static exam.E07.getcolor;
public class E07_1 {
	
	public void matchShirt() {
		
		String color =  E07.getColor();
		if(color.equals("Green")) {
			System.out.println("Fit");
		}
	}
	
	public static void main (String[] args) {
		E07_1 trouser = new E07_1();
		trouser.matchShirt();
	}
	
	//import clothing.Shirt;
	//String color = getColor();
	
	//import clothing.*;
	//String color = Shirt.getColor();

	//import static clothing.Shirt.getcolor;
	//String color = getColor();
	
	//String color = Shirt.getColor();
	
	//import clothing;
	//String color = Shirt.getColor();
}
