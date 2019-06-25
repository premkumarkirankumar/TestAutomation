package examples;

public class Example6_3 extends Example6_2 {
	
	public void test() {
		System.out.println("DerivedB");
	}
	
	public static void main(String[] args) {
		Example6_1 b1= new Example6_3();
		b1.test();
		Example6_1 b2= new Example6_2();
		b2.test();
		Example6_1 b3= new Example6_3();
		b3.test();
		
		b1=( Example6_1 )b3;
		
		Example6_1 b4= ( Example6_2 )b3;
		b1.test();
		b4.test();
	}

}
