package exam;

import java.io.IOException;

public class E48_1 {
	
	public static void main(String [] args) {
		
		E48_0 xobj= new E48_0();
		try {
			xobj.printFileContent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
