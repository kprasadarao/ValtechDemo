import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContactPageTest {

	@Test
	public void testContactText(){
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.valtech.com/");
		
		// click on contact link
		
		driver.findElement(By.xpath("//*[@id='CTA-form-trigger']/div/div/span")).click();
		
		Select list = new Select (driver.findElement(By.xpath("//*[@id='Question']")));
		
		List options = list.getOptions();
		
		System.out.println("the number of branches are: "+options.size());
		
		driver.quit();
	}
}
