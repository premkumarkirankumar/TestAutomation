package examples;

public class Example5 {

	String name;
	boolean contract;
	double salary;
	
	Example5() {
		/*
		this.name="Joe";
		this.contract=true;
		this.salary=100;
		*/
		/*
		name="Joe";
		contract=true;
		salary=100;
		*/
		
	}
	
	public String toString() {
		return name+":"+contract+":"+salary;
	}
	
	public static void main(String[] args) {
		Example5 e= new Example5(); {
			e.name="joe";
			e.contract=true;
			e.salary=100;
			System.out.println(e);
		}
	}
}
