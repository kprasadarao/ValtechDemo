import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LatestNewsTest {
	
	@Test
	public void AssertTest(){
		

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.valtech.com/");
		
		String  ActualNewsText = driver.findElement(By.xpath("//*[@id='container']/div[2]/div[3]/div[1]/header/h2")).getText();
		
		System.out.println("The text received from the page element is : "+ActualNewsText);
		
		String expectedString = "LATEST NEWS";		
		Assert.assertEquals(ActualNewsText, expectedString);
		
		System.out.println(">>> Latest News section is Displayed in the Page>>>");
		
		driver.quit();
		
		
	}

}
