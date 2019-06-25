package constructorConcepts;

public class ConClass19 {
	
	// Following is a normal constructor and it will have the same name as the class name

	
	public ConClass19() { 
		
		System.out.println("This is a normal Constructor");
	
	}
	
	// Following is a parameterized constructor and it will have the same name as the class name
	
	public ConClass19(String text) { 
		
		System.out.println(text);
	
	}
	
	public ConClass19(int a, int b) { 
		
		System.out.println("sum:"+(a+b));
	
	}
	
	public static void main(String[] args) {
		
		ConClass19 ob= new ConClass19();
		ConClass19 ob1= new ConClass19("This is a parameterized Constructor");
		ConClass19 ob2= new ConClass19(10,2);
	}
}
