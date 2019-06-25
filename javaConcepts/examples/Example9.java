package examples;

public class Example9 {
	
	public String name;
	public int moons;
	
	public Example9(String name, int moons) {
		this.name= name;
		this.moons= moons;
	}
	
	public static void main (String [] args) {
		Example9[] ob1=  {
				new Example9("Mercury",0),
				new Example9("Venus",0),
				new Example9("Earth",1)
		};
		
	System.out.println(ob1);
	System.out.println("\n");
	//System.out.println(ob1[1]);
	System.out.println("\n");
	System.out.println(ob1[2]);
	System.out.println("\n");
	System.out.println(ob1[2].moons);

	}

}
