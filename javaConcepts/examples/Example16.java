package examples;

public class Example16 {
	
	public static void main (String [] args) {
		
		int []s= {10,20,30};
		int size= 3;
		int idx=0;
		do {
			idx++;
		} while(idx<size-1);
		
		System.out.println(s[idx]);
	}

	
}
