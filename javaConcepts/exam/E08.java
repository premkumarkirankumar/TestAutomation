package exam;

public class E08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[][] = {{1,3},{2,4}};
		System.out.println(n.length);
		for(int i= n.length-1;i>=0;i--) {
			for (int y:n[i]) {
				System.out.println("i value- "+i);
				System.out.println(y);
			}
		}

	}

}
