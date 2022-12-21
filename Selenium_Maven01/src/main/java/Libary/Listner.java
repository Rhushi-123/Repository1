package Libary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Listner implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Test case Started "+result.getName(),true);
	}

	
	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot sh = (TakesScreenshot)Base_Class.driver;
		File scr = sh.getScreenshotAs(OutputType.FILE);
		File dist = new File("C:\\Users\\manis\\eclipse-workspace\\Selenium_Maven01\\src\\main\\resources\\ScreenShot\\"+result.getName()+".png");
		try {
			Files.copy(scr, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case Success "+result.getName(),true);

		
	}


}
