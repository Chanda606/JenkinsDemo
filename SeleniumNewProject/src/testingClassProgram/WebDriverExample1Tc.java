//author Chanda 
package testingClassProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverExample1Tc 
{
	
	public static void main(String[] args) {

	// Configuring the system properties of chrome driver
    System.setProperty("webdriver.chrome.driver", "/Users/chandaverma/Downloads/Drivers/chromedriver");

	//Initializing the browser driver
	WebDriver driver = new ChromeDriver();

	//Navigating through the facebook  website
	driver.get("https://facebook.com");

	System.out.println("Selenium Webdriver Test Script in Chrome");
	

	}
	}
	 
			
