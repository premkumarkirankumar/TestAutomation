package conditionalStatement;

public class IfCondition {
	
	public void getGrade(int total) {
		
		if(total>100) {
			System.out.println("Invalid Input");
		}
		else if(total>=90 && total<=100) {
			System.out.println("Grade A");
		}
		else if(total>=80 && total<=90) {
			System.out.println("Grade B");
		}
		else if(total>=70 && total<=80) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade D");
		}
	}
	
	public static void main (String [] args) {
		
		IfCondition ob= new IfCondition();
		ob.getGrade(97);
	}

}
