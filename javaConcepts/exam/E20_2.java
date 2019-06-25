package exam;

public class E20_2 extends E20_1 implements E20_0 {
	
	public void export() {
		System.out.println("RTool::Export");
	}
	
	public static void callExport (E20_0 ex) {
		ex.export();
	}
	
	public static void main(String[] args) {
		E20_1 aTool= new E20_2();
		E20_1 bTool = new E20_1();
		callExport(aTool);
		callExport(bTool);
	}

}
