package strings;

public class HandleStrings {
	
	public static void main (String [] args) {
		
		String text="Allegis Global Solutions";
	
		System.out.println(text.charAt(0));
		System.out.println(text.startsWith("Allegis"));
		System.out.println(text.startsWith("Tek"));
		System.out.println(text.indexOf("G"));
		System.out.println(text.contains("Global"));
		System.out.println(text.isEmpty());
		System.out.println(text.length());	
		System.out.println(text.substring(8));
		System.out.println(text.substring(8,15));
	}
}
