package examples;

public class Example3 {

	public static void main(String[] args) {
		
		//print the array in reverese
		int array[] = {10,20,30,40,50};
		int x= array.length;
		
		//length
		System.out.println(x);
		
		//1st way
		while(x>0) {
			System.out.println(array[--x]);
			System.out.println("Value of x="+x);
		}
		
		//2nd way
		do {
			x--;
			System.out.println(array[x]);
			System.out.println("Value of x="+x);
		
		}
		while(x>=0);
	}

}
