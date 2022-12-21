package Libary;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Data_Utility.Data_Driven;
import Data_Utility.KeyWord_Driven;

public class Base_Class {
	static public WebDriver driver;
	public KeyWord_Driven kd = new KeyWord_Driven();
	
	
	public Data_Driven dd = new Data_Driven();

	Random r = new Random();
	int x = r.nextInt(100000);
	public String data = "Rhushi" + x;

	@BeforeClass
	public void OpenApp() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manis\\eclipse-workspace\\selenium\\Server\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(kd.PropertyFetch("URL"));

	}

	@BeforeMethod
	public void login() throws IOException {
		driver.findElement(By.id("username")).sendKeys(kd.PropertyFetch("UN"), Keys.TAB, kd.PropertyFetch("PW"),
				Keys.ENTER);

	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();

	}

	@AfterClass
	public void closeApp() {
		driver.close();

	}


}
