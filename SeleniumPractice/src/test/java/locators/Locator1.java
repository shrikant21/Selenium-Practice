package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		

	}

}
