package examples;

public class Example20 {

	
	public static void main (String[] args) {
		
		String str= " ";
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
		
		int [] arr = {15,30,45,60,75};
		arr[2]=arr[4];
		arr[4]=90;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}
}
