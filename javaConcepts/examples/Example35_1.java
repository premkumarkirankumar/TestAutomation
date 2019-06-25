package examples;

public class Example35_1 {
	
	int ns;
	static int s;
	
	Example35_1(int ns) {
		if(s<ns) {
			s=ns;
			this.ns=ns;
		}
	}	
		void doPrint() {
			System.out.println("ns= "+ns+"s= "+s);
		}

}
