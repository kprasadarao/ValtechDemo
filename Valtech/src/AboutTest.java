import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AboutTest {

	@Test
	public void testH1tag(){
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.valtech.com/");
		
		driver.findElement(By.xpath("//*[@id='menu-toggle-button']/span[1]/span/span[1]/i")).click();
		driver.findElement(By.xpath("//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='container']/div[1]/h1")).isDisplayed());
		
		System.out.println("About tag is displayed in the page");
		
		//Going back to main menu
		
		driver.navigate().back();
		
		// selecting services link
		driver.findElement(By.xpath("//*[@id='navigationMenuWrapper']/div/ul/li[3]/a")).click();
		
		// checking services text with h1 tag is diplayed
		
		System.out.println(driver.findElement(By.xpath("//*[@id='container']/section/header/h1")).isDisplayed());
		
		System.out.println("Services Page dispalyed as services  ");
		
		
		//Going back to main menu
		
		driver.navigate().back();
			
		// selecting work link
		driver.findElement(By.xpath("//*[@id='navigationMenuWrapper']/div/ul/li[2]/a")).click();
				
		// checking work page work text with h1 tag is diplayed
			
		System.out.println(driver.findElement(By.xpath("//*[@id='container']/header/h1")).isDisplayed());
				
		System.out.println("Work  Page dispalyed as work with h1 tag  ");
		
		
		// Naviage to Contact page
		
		
		
		//driver.quit();
		
		
	}
	
}
