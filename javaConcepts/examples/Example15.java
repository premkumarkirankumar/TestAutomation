package examples;

public class Example15 {
	
	static int count=0;
	int i=0;
	
	public void changeCount () {
		while(i<5) {
			i++;
			count++;
			System.out.println(count);
		}
	}
	
	public static void main (String[] args) {
		Example15 check1 = new Example15();
		Example15 check2 = new Example15();
		check1.changeCount();
		check2.changeCount();
		
		System.out.println(check1.count);
		System.out.println(check2.count);
	}

}
