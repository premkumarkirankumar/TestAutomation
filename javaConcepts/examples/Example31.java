package examples;

public class Example31 {
	
	public static void main(String[] args) {
		
		int x=5;
		while(isAvailable(x)) {
			System.out.println(x);
			x--;
		}
	}

	
	public static boolean isAvailable(int x ) {
		return x-->0?true:false;
	}
}
