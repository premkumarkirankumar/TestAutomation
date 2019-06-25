package collections;

import java.util.ArrayList;

public class ExampleRepeatStrings {

	public static void main(String[] args) {

		repeatString("All is well is not well and is definitely is well");
	}

	public static void repeatString(String text) {

		// text is split bases on the spaces
		String[] textsplit = text.split("\\s+");

		for (int i = 0; i < textsplit.length; i++) {

			//System.out.println(textsplit[i]);
		}

		// create an empty arraylist
		ArrayList<String> empty = new ArrayList<String>();

		// not iterate through the array to validate
		for (int j = 0; j < textsplit.length; j++) {

			//assigning k= 0;
			int k = 0;
			
			if (!empty.contains(textsplit[j])) {

				// if the empty array list doesnt contain the string- we add it and increment
				// the k value by 1
				empty.add(textsplit[j]);
				
				//System.out.println(empty);
				k++;

				// now go through the rest of the text
				for (int m = j + 1; m < textsplit.length; m++) {

					if (textsplit[j].contentEquals(textsplit[m])) {

						k++;
					}
				}
				
				System.out.println("Strings:"+textsplit[j]);
				
				System.out.println("times repeated:"+k);

			}
			

		}

	}

}
