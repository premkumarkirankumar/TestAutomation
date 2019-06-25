package exam;

public class E43 {
	

	public static void main(String[] args) {
		String str1= "Java";
		String str2= new String("java");
		String str3= str2;
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
	}

}
