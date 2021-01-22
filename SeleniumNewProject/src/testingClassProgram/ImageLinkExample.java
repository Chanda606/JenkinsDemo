
//author Chanda
package testingClassProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageLinkExample {
	
	public static void main(String[] args) 
	   {
	       System.setProperty("webdriver.gecko.driver","/Users/chandaverma/Downloads/Drivers/geckodriver"); 
	       
	       String baseUrl = "https://www.aa.com/homePage.do";

	       WebDriver driver = new FirefoxDriver();

	       driver.get(baseUrl);

	       driver.findElement(By.xpath(".//*[@id='heroSlide0']/img")).click();

	    }

}
