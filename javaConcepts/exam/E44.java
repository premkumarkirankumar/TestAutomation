package exam;

public class E44 {
	
	int id;
	String name;
	
	public E44(int id, String name) {
		this.id= id;
		this.name=name;
		
	}

	public static void main(String[] args) {
		E44 p1 = new E44(101,"Pen");
		E44 p2 = new E44(101,"Pen");
		E44 p3 = p1;
		boolean ans1= p1==p2;
		boolean ans2= p1.name.equals(p2.name);
		System.out.println(ans1+":"+ans2);
	}

}
