package exam;

public class E03 {
	
	String name;
	int age=25;
	
	public E03(String name) {
		//this();
		setName(name);
	}
	
	public E03(String name, int age) {
		//E03(name);
		setName(name);
		setAge(age);
	}
	
	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	  
		
	  // Getter
	  public int getAge() {
	    return age;
	  }

	  // Setter
	  public void setAge(int age) {
	    this.age =age;
	  }
	
	  public String show() {
		  return name+" "+age;
	  }
	
	
	
	
	public static void main(String[] args) {
		E03 p1= new E03("Jesse");
		E03 p2= new E03("Walter",50);
		System.out.println(p1.show());
		System.out.println(p2.show());


	}

}
