package examples;

import java.util.ArrayList;

public class UsingList {
	
	public static void main (String [] args) {
		
		java.util.List<String> c= new ArrayList<String>();
		c.add("black");
		c.add("yell");
		c.add("blue");
		c.add("green");
		c.remove(2);
		System.out.println(c);
		c.add(3, "cyan");
		System.out.println(c);
		
		
		int wd=0;
		String d[] = {"sun","mon","tue","sat"};
		for (String s:d) {
			switch(s) {
			case "sat":
			case "sun":
				wd-=1;
				break;
			case "mon":
				wd++;
			case "tue":
				wd+=2;
				
			}
		}
		System.out.println("Value "+wd);
		
		int  w=0;
		w-=1;
		System.out.println("Value "+w);
		w++;
		System.out.println("Value "+w);
		w+=2;
		System.out.println("Value "+w);
		
	
	}

}
