package arrays;

public class exampleMinMaxNum {
	
	public static void main (String[] args) {
		
		minNum();
		maxNum();
	}
	
	public static void minNum() {
		
		int[][] a= {{23,43,31},{8,20,65},{68,54,41}}; 
		int minNum=a[0][0];
		
		//System.out.println(a[0][1]);
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i][j]<minNum) {
					minNum=a[i][j];
				}
				
				//System.out.println(a[i][j]);
			}
		}
		
		System.out.println(minNum);
	}
	
	public static void maxNum() {
		
		int[][] a= {{23,43,31},{8,20,65},{68,54,41}}; 
		int maxNum=a[0][0];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i][j]>maxNum) {
					maxNum=a[i][j];
				}
				
			}
		}
		
		System.out.println(maxNum);
	}

}
