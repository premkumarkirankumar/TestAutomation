package examples;

public class Example25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stuff= "TV";
		String res= null;
		
		if(stuff.equals("TV")) {
			res="Walter";
		} else if( stuff.equals("Movie")) {
			res= "white";
		} else {
			res= "No Result";		
		}
		
		System.out.println(res);
		
		
		String res1= stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No Result";
		System.out.println(res1);

	}

}
