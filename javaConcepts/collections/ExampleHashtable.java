package collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleHashtable {
	
	public static void main (String[] args) {
		
		exampleHashable() ;
		
	}

	public static <V> void exampleHashable() {
		
		Hashtable<Integer, String> hm= new Hashtable<Integer, String>();
		hm.put(0, "Allegis");
		hm.put(1,"Tek");
		
		System.out.println(hm);
		
		hm.put(1,"Teks"); // it overwrites the index 1
		System.out.println(hm);
		
		hm.put(3,"MSU");
		System.out.println(hm);
		
		hm.put(2,"GB1");
		System.out.println(hm);
		
		hm.put(10, "GB3");
		System.out.println(hm);
		
		hm.put(7, "Test");
		System.out.println(hm);
		
		hm.put(8, "Test1");
		System.out.println(hm);

		hm.remove(8);
		System.out.println(hm);
		
		hm.remove(7, "Test");
		System.out.println(hm);
		
		hm.remove(7, "Test");
		System.out.println(hm);
		
		hm.put(20, ""); // can enter null value
		System.out.println(hm);
		
		hm.put(21, "Null"); // can enter null value as a string
		System.out.println(hm);
		
		//hm.put(null, ""); // cannot enter null key
		//System.out.println(hm);
		
	//	Set hms=hm.entrySet(); //converting hashmap to set interface
		
	//	Iterator hmsi=hms.iterator();
		
	//	System.out.println(hmsi.next());
		
		//print with the key value pair
	//	while(hmsi.hasNext()) {
	//		System.out.println(hmsi.next());	
	//	}
		
		//print key seperately pair seperately
	//	while(hmsi.hasNext()) {
	//		Map.Entry hmsimp=(Map.Entry)hmsi.next();
	//		
	//		System.out.println("Key:"+hmsimp.getKey());	
	//		System.out.println("Value:"+hmsimp.getValue());	
	//	}
		
		
		//using enumeration before converting to set interface
		Enumeration<Integer> ehm=hm.keys();
		System.out.println(ehm.nextElement());
		
		while(ehm.hasMoreElements()) {
			int keys=ehm.nextElement();
			
			System.out.println("Key:"+keys);
			System.out.println("Value:"+hm.get(keys));
	
		}
		
		
	
		
	}

}
