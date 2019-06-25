package examples;

public class Example19 {
	
	String mystr= "7007";
	
	public void doStuff(String str) {
		int myNum=0;
		try {
			String myStr= str;
			myNum= Integer.parseInt(myStr);
			
		}
		catch (NumberFormatException ne) {
		System.err.println("Error");
		}
		System.out.println("mystr : "+mystr+",myNum : "+myNum);
	}
	
	
	public static void main(String[] args) {
		
		Example19 obj= new Example19();
		obj.doStuff("9009");
	}

}
