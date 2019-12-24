package seleniumdemo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	
	private WebDriver driver = null;
	
	@After
	public void destroy() {
		driver.close();
	}
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "d:\\s\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testLoginForNewUser()throws InterruptedException {
		driver.get("http://localhost:8080/sample-app1/");
		String title = driver.getTitle();
		System.out.println("Page title "+title);
		WebElement element = driver.findElement(By.id("username"));
		assertNotNull(element);
		Thread.sleep(2000);
		element.sendKeys("max1");
		WebElement btnElement = driver.findElement(By.id("login"));
		assertNotNull(btnElement);
		btnElement.click();
		Thread.sleep(2000);
		String title2 = driver.getTitle();
		assertEquals("New User",title2);
		
	}
}
