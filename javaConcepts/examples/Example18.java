package examples;

public class Example18 {
	
	
	public static void main (String[] args) {
		String shirts[][]= new String[2][2];
		shirts[0][1]="red";
		shirts[0][1]="Blue";
		shirts[1][0]="small";
		shirts[1][1]="medium";

		
		for(int index =0;index<2;) {
			for(int idx=0;idx<2;) {
				System.out.print(shirts[index][idx]+":");
				idx++;
			}
			index++;
			
		}
		

	}

	

}
