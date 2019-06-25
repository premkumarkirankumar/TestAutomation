package collections;

import java.util.ArrayList;

public class ExampleUniqueNumber {

	public static void main(String[] args) {
		
		int[] a = { 4, 5, 6, 6, 6, 5, 4, 7, 5, 7, 5, 8, 1, 5, 7 ,1};
		uniqueNumber(a);

	}

	public static void uniqueNumber(int [] a) {


		ArrayList<Integer> ea = new ArrayList<Integer>();

		// for loop to iterate through array a
		for (int i = 0; i < a.length; i++) {
			
			//assigning k= 0;
			int k = 0;
			
			
			// if conditon to check whether the list doesn't contains a[1]
			if (!ea.contains(a[i])) {

				// adds that array to the arraylist
				ea.add(a[i]);
				k++; // increasing the k count to 1

				// now check the remaining values in the array if it matches and j value is set to i +1
				for (int j = i+1; j < a.length; j++) {
					
					if(a[i]==a[j]) {
						
						k++; // k value incremented again if it matches
						
					}
				}
				
				System.out.println("Values:"+a[i]);
				
				System.out.println("times repeated:"+k);
				
				
				if(k==1) {
					
					System.out.println("Unique Number :"+a[i]);
				}
			}
		}
	}

}
