package collections;

import java.util.ArrayList;

public class ExampleArrayList {
	
	public static void main (String [] args) {
		
		exampleListString();
		exampleListInteger();
		
	}
	
	public static void exampleListString() {
		
		ArrayList<String> als= new ArrayList<String>();
		als.add("Allegis");
		als.add("Tek");
		als.add("MSU");
		als.add("MSU"); // can add duplicates and data stored in sequential order
		
		System.out.println(als);
		als.add(1, "GB1");
		System.out.println(als);
		als.remove(2);
		System.out.println(als);
		als.add("Tek");
		System.out.println(als);
		System.out.println(als.contains("Tek"));
		als.remove("GB1");
		System.out.println(als);
		
		System.out.println(als.get(0));
		
		for(int i=0;i<als.size();i++) {	
			System.out.println(als.get(i));		
		}
	}
	
	
	public static void exampleListInteger() {
		
		ArrayList<Integer> ali= new ArrayList<Integer>();
		ali.add(1);
		ali.add(2);
		ali.add(3);
		
		System.out.println(ali);
		ali.add(1, 21);
		System.out.println(ali);
		ali.remove(2);
		System.out.println(ali);
		ali.add(50);
		System.out.println(ali);
		System.out.println(ali.contains(50));
		ali.remove(2);
		System.out.println(ali);
		
		System.out.println(ali.get(0));
		
		for(int i=0;i<ali.size();i++) {	
			System.out.println(ali.get(i));		
		}
	}

}
