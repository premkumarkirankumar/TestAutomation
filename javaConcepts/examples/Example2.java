package examples;

public class Example2 {
	
	public static int stVar=100;
	public int var=200;
	
	public String toString() {
		return var +":"+stVar;
	}
	
	public static void main (String [] args) {
		Example2 t1 = new Example2();
		t1.var=300;
		System.out.print(t1);
		Example2 t2 = new Example2();
		t2.stVar=300;
		System.out.print(t2);
	}

}
