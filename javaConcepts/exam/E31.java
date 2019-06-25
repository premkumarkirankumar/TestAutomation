package exam;

public class E31 {

	public static void main(String[] args) {

		
		int[] intArr= {15,30,45,60,75};
		intArr[2]= intArr[4];
		intArr[4]= 90;
		
		System.out.println(intArr[0]);
		
		System.out.println(intArr[1]);
		
		System.out.println(intArr[2]);
		
		System.out.println(intArr[3]);
		
		System.out.println(intArr[4]);

	}

}
