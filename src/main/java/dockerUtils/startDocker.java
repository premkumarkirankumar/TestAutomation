package dockerUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class startDocker {

	@Test
	public void startFile() throws IOException, InterruptedException {

		File f1= new File("output.txt");
		if(f1.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Unable to delete file");
		}
		
		
		boolean flag = false;
		// execute the batch file for docker up instanct
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("cmd /c start dockerUp.bat");

		String f = "output.txt";

		// handle synchronization issues
		Calendar cal = Calendar.getInstance();// 2:44 15th second
		cal.add(Calendar.SECOND, 45);// 2:44 45seconds
		long stopnow = cal.getTimeInMillis();
		Thread.sleep(3000);

		while (System.currentTimeMillis() < stopnow) {
			if (flag) {
				break;
			}

			BufferedReader reader = new BufferedReader(new FileReader(f));
			String currentLine = reader.readLine();

			//handle reading the file
			while (currentLine != null && !flag)

			{

				if (currentLine.contains("registered to the hub and ready to use")) {
					System.out.println("found my text");
					flag = true;// 14th seconds
					break;
				}

				currentLine = reader.readLine();
			}
			reader.close();

		}

		Assert.assertTrue(flag);
		
		//spin up containers 
		runtime.exec("cmd /c start scale.bat");
		Thread.sleep(15000);

	}

}
