package test_Cases;



import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Libary.Base_Class;
@Listeners(Libary.Listner.class)
public class Tc3 extends Base_Class{
	@Test
	public void t3() throws Exception, IOException
	{
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(data);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("XYZ");
	}


}
