package examples;

public class Example22 {
	
	public static void main (String [] args) {
		
		int x= 100;
		int a= x++;
		int b= ++x;
		int c= x++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		//int d= (a<b)? (a<c) ?a:(b<c)?b:c;
	}

}
