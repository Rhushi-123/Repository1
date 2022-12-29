package test_Cases;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Libary.Base_Class;
@Listeners(Libary.Listner.class)
public class Tc2 extends Base_Class{
	@Test
	public void t2() throws EncryptedDocumentException, IOException
	{
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("input[placeholder='Start typing name ...']")).sendKeys(dd.excelFetch("Sheet1", 1, 1));
	}



}
