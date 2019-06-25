package miscPrograms;

public class ReverseString {
	
	public static void main (String[] args) {
		
		reverse("Jack");
		reverseStringBuilder("Jim");
		reverseStringBuffer("John");
	}
	
	public static void reverse(String text) {
		
		String reverse="";
		
		for(int i=text.length()-1;i>=0;i--) {
			
			reverse= reverse+text.charAt(i);
		}
		
		System.out.println(reverse);
	}
	
	
	public static void reverseStringBuilder(String text) {
		
		StringBuilder rev= new StringBuilder();
		rev.append(text);
		
		rev=rev.reverse();
		
		System.out.println(rev);
	}

	
	public static void reverseStringBuffer(String text) {
		
		StringBuffer buffer = new StringBuffer(text);
		String rev= buffer.reverse().toString();
		System.out.println(rev);
	}
}
