package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\eclipse-workspace\\selenium\\Server\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");

	}
}
