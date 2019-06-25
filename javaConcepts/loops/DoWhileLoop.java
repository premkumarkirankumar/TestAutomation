package loops;

public class DoWhileLoop {
	
	public void printNumbersReverse(int number) {
		
		do {
			System.out.println(number);
			number--;
		}while(number>0);
		
	}
	
	public static void main(String[] args ) {
		
		DoWhileLoop ob= new DoWhileLoop();
		ob.printNumbersReverse(10);
	}
}
