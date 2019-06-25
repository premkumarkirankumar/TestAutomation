package exam;

public class E33 {
	
	static int count=0;
	int i=0;
	
	public void changecount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	
	public static void main (String[] args) {
		E33 check1= new E33();
		E33 check2= new E33();
		check1.changecount();
		check2.changecount();
		
		System.out.println(check1.count);
		System.out.println(check2.count);
	}

}
