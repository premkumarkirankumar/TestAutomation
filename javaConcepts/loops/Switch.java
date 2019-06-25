package loops;

public class Switch {

	public void grade(String grade) {

		switch (grade) {
		case "A":
			System.out.println("Your marks is in the range 90- 100");
			break;
		case "B":
			System.out.println("Your marks is in the range 80- 90");
			break;
		case "C":
			System.out.println("Your marks is in the range 70- 80");
			break;
		case "D":
			System.out.println("Your marks is below 70");
			break;
		default:
			System.out.println("Invalid Input");

		}
	}

	public static void main(String[] args ) {
		
		Switch ob= new Switch();
		ob.grade("C");
	}
	
	
}
