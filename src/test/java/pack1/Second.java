package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Second {

	@Test
	
	public void a1() throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Prerna Pandey\\eclipse-workspace\\Testing\\resources\\data.properties");
		
		prop.load(fis);
		
	System.out.println(	prop.getProperty("browser"));
		
		prop.setProperty("browser", "firefox");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Prerna Pandey\\eclipse-workspace\\Testing\\resources\\data.properties");
		
		prop.store(fos, null);
		
		System.out.println(prop.getProperty("browser"));
		
		prop.setProperty("browser", "chrome");
		
		System.out.println(prop.getProperty("browser"));
		
		
		
		
	}
	
}
