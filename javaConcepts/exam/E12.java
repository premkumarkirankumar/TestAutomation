package exam;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] chs = new String[2][];
		//System.out.println(chs.length);
		
		chs[0]= new String[2];
		chs[1]= new String[5];
		int i=97;
		
		for(int a=0;a<chs.length;a++) {
			for (int b=0;b<chs.length;b++) {
				chs[a][b]=""+i;
				i++;
			}
		}
		
		for(String[] ca:chs) {
			for(String c:ca) {
				System.out.println(c+" ");
			}
			System.out.println();
		}

	}

}
