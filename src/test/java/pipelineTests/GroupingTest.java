package pipelineTests;

import org.testng.annotations.Test;


public class GroupingTest {

	@Test(groups= {"gp"})
	public void unit1() throws Exception {
		
		System.out.println("Release to Production 1");
		}


	@Test
	public void unit2() throws Exception {
		
		System.out.println("Release to Production 2");
		}
	
	@Test(groups= {"gp"})
	public void unit3() throws Exception {
		
		System.out.println("Release to Production 3");
		}
	
	@Test
	public void unit4() throws Exception {
		
		System.out.println("Release to Production 4");
		}
	
	@Test
	public void unit5() throws Exception {
		
		System.out.println("Release to Production 5");
		}

}