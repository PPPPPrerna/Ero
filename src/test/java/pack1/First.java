package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;

import org.apache.logging.log4j.*;

public class First {
	
	WebDriver driver;
	
	
	
	@BeforeClass
	
	public void m1() {
		
		
		
		Logger logg = LogManager.getLogger(First.class.getName());
		
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//geckodriver.exe");
		
		
		
		driver = new FirefoxDriver();
		
		 //driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		logg.info("printed");
		
		logg.error("error occurred");
		
		logg.error("cool");
		
		logg.error("yess");
		
		
		
	}
	
	@Test
	
	public void m2() {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().sendKeys("Prerna").build().perform();
		
	}
	
	
	@Test
	
	public void m3() {
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(driver.findElement(By.xpath("//a[text()='Amazon Pay']"))).click().build().perform();
		
	}

	@Test
	
	public void a2() {
		
		
		
		
	}
	
}
