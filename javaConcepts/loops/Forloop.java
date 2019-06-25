package loops;

public class Forloop {
	
	//simple for loop
	public void printNumbers(int number) {
		
		for( int i=0;i<=number;i++) {
			
			System.out.println(i);
		}
		
	}
	
	
	//enhance for loop or for each loop
	public void printNumbers1(int[] number) {
		
		for(int num:number) {
			
			System.out.println("Array numbers:"+num);
		}
		
	}
	
	
	
	public static void main ( String [] args) {
		
		Forloop ob= new Forloop();
		ob.printNumbers(5);

	}

}
