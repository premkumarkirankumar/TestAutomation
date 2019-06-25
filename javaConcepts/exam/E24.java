package exam;

public class E24 {
	
	public String name;
	public int moons;
	
	public E24(String name, int moons) {
		this.name= name;
		this.moons= moons;
	}
	
	public static void main (String [] args) {
		E24[] ob1=  {
				new E24("Mercury",0),
				new E24("Venus",0),
				new E24("Earth",1)
		};
		
	System.out.println(ob1);
	//System.out.println(ob1[1]);
	System.out.println(ob1[2]);
	System.out.println(ob1[2].moons);

	}


}
