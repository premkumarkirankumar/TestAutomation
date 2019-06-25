package collections;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {

	public static void main(String[] args) {
		//exampleSetString();
		exampleSetInteger();
	}

	public static void exampleSetString() {

		HashSet<String> hss = new HashSet<String>();
		hss.add("Allegis");
		hss.add("Tek");
		hss.add("MSU");

		System.out.println(hss);
		hss.add("GB1");
		System.out.println(hss);
		hss.add("GB2");
		System.out.println(hss);
		hss.remove("Tek");
		System.out.println(hss);
		hss.add("TEK");
		System.out.println(hss);
		hss.add("TEK"); // wont add duplicate values and the data is not added in sequential order
		System.out.println(hss);

		Iterator<String> hssi = hss.iterator();

		/*
		 * System.out.println(hssi.next()); System.out.println(hssi.next());
		 * System.out.println(hssi.next()); System.out.println(hssi.next());
		 * System.out.println(hssi.next());
		 */

		while (hssi.hasNext()) {
			System.out.println(hssi.next());
		}
		
	}

		
		public static void exampleSetInteger() {

			HashSet<Integer> hsi = new HashSet<Integer>();
			hsi.add(1);
			hsi.add(2);
			hsi.add(3);

			System.out.println(hsi);
			hsi.add(4);
			System.out.println(hsi);
			hsi.add(5);
			System.out.println(hsi);
			hsi.remove(3);
			System.out.println(hsi);
			hsi.add(34);
			System.out.println(hsi);
			hsi.add(34); // wont add duplicate values and the data is not added in sequential order
			System.out.println(hsi);

			Iterator<Integer> hsii = hsi.iterator();

			/*
			 * System.out.println(hsii.next()); System.out.println(hsii.next());
			 * System.out.println(hsii.next()); System.out.println(hsii.next());
			 * System.out.println(hsii.next());
			 */

			while (hsii.hasNext()) {
				System.out.println(hsii.next());
			}
			

		}

}
