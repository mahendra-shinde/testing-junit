package mary.demo.webtest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ErrorPage {

	public String badUrl(WebDriver driver, String badUrl) throws IOException {

		driver.get(badUrl);
		String nextPageTitle = driver.getTitle();

		return nextPageTitle;
		

	}
}
