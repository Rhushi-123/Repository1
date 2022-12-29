package test_Cases;



import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Libary.Base_Class;
@Listeners(Libary.Listner.class)
public class Tc1 extends Base_Class{
	@Test
	public void t1() throws Throwable {
		
	    driver.findElement(By.id("taskSearchControl_field")).sendKeys(dd.excelFetch("Sheet1", 1, 1));

	}


}
