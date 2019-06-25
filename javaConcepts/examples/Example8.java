package examples;

public class Example8 {
	
	public static final int MIN=1;
	public static void main (String [] args) {
		int x= args.length;
		System.out.println(x);
		
		if(checkLimit(x)) { 
			System.out.println("Java 1");
		}
		else {
			System.out.println("Java 2");
		}
		
	}
	
	public static boolean checkLimit(int x) {
		return (x>=MIN)?true:false;
	}

}
