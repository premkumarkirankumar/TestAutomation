package exam;

public class E34 {
	
	int x;
	int y;
	public void doStuff(int x, int y) {
		this.x=x;
		y=this.y;
		
	}

	public void displaye() {
		System.out.println(x+" "+y+":");
	}
	
	public static void main (String args[]) {
		E34 m1= new E34();
		m1.x=100;
		m1.y=200;
		E34 m2= new E34();
		m2.doStuff(m1.x, m1.y);
		m1.displaye();
		m2.displaye();
	}
}
