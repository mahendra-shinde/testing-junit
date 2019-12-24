package seleniumdemo1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {
private WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "d:\\s\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void cleanUp() {
		driver.close();
	}
	
	@Test
	public void testGoogle() {
		driver.get("https://google.com");
		String title= driver.getTitle();
		assertEquals("Google", title);
	}
}
