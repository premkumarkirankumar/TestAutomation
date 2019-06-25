package examples;

public class Example28 {
	
	public static void main(String [] args) {
		
		int ivar= 100;
		float fvar=100.100f;
		double dvar= 123;
		//ivar= fvar;
		fvar=ivar;
		dvar=fvar;
	//	fvar= dvar;
		dvar=ivar;
		//ivar= dvar;
		
		//integer cannot to be assinged to float and double and float cannot have double value
		
		
		Short s1= 200;
		Integer s2= 400;
		Long s3= (long)s1+s2;
		///String s4= (String) (s3*s2);
		//cannot cast
		//System.out.println("Sum is "+s4);
		
		
		
	}

}
