package firstProjectPavan.firstProjectPavan;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class test2 {

	
	
	
   @Test
	public void jobsearchOnAllegisGroupHomePageBasic() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        		
	        //added information
	        String baseUrl = "https://www.aerotek.com";					
	        driver.get(baseUrl);
	        System.out.println(driver.getTitle());
           driver.quit();
	}
	
	
}
