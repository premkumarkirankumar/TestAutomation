package pipelineTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DeployTestFail {

	@Test
	public void deploy() throws Exception {
		
		System.out.println("Deploy to TEST Environment");
		Assert.assertTrue(false);
		Thread.sleep(5000);
		}



}