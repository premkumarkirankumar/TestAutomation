package exam;

public class E18 {
	String name;
	boolean contract;
	double salary;
	
	E18(){
		//first way using this
		//this.name= new String("Joe");
		//this.contract= new Boolean(true);
		//this.salary= new Double(100);	
		
		
		//name="joe";
		//contract=TRUE;
		//salary=100.0f;
		
		
		this.name="Joes";
		this.contract= true;
		this.salary=100;	
		
		
		
	}
	
	public String toString() {
		return name +":"+contract+":"+salary;
	}
	
	
	public static void main(String args[]) {
		E18 e= new E18();
		System.out.println(e);
		
	}

}
