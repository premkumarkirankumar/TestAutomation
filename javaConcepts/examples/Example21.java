package examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example21 {
	
	public static void main (String[] args) {
		
		//String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		//System.out.println(date);
		
		//exception thrown at the run time
		
		LocalDate date1= LocalDate.now();
		LocalDate date2= LocalDate.of(2014, 6, 20);
		LocalDate date3= LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		LocalDate date4= LocalDate.of(2014, 01, 32);
		date4.plusDays(10);
		System.out.println(date4);
		
	}

}
