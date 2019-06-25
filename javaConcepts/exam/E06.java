package exam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class E06 {
	
	public static void main (String[] args) {
		
		
		LocalDate date1= LocalDate.now();
		
		LocalDate date2= LocalDate.of(2014, 4, 30);
		
		LocalDate date3= LocalDate.parse("2014-04-30",DateTimeFormatter.ISO_DATE);
			
		System.out.println("date1= "+date1);
		
		System.out.println("date2= "+date2);
		
		System.out.println("date3= "+date3);
	}


	

}
