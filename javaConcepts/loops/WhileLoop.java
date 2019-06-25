package loops;

public class WhileLoop {

	public void printNumbersReverse(int number) {
		
		while(number>0) {
			System.out.println(number);
			number--;
		}
	}
	
	
	public static void main(String[] args ) {
		
		WhileLoop ob= new WhileLoop();
		ob.printNumbersReverse(10);
	}
}
