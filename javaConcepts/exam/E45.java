package exam;

public class E45 {
	static boolean isAvailable=false;
	
	public static void main (String [] args) {
		E45 ts= new E45();
		System.out.print(isAvailable+" ");
		isAvailable= ts.doStuff();
		System.out.println(isAvailable);
	}

	public static boolean doStuff() {
		return !isAvailable;
	}
}
