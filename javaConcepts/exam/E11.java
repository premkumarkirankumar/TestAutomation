package exam;

import java.util.ArrayList;

public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> points= new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		points.add(null);
		System.out.println(points);
		points.remove(2);
		System.out.println(points);
		points.remove(null);
		System.out.println(points);
	
		
		
	}

}
