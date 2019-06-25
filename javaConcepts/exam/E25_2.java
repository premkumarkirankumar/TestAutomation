package exam;

public class E25_2 extends E25_1 {

	public int stockOptions;

	
	public static void main (String[] args) {
		
		E25_0 employee= new E25_0();
		E25_1 manager= new E25_1();
		E25_2 director= new E25_2();
		
		employee.salary=50_000;
		director.salary=80_0000;
		//employee.budget
		manager.budget=1_000_000;
		//manager.stockoptions
		director.stockOptions=1_000;
	
	}
}
