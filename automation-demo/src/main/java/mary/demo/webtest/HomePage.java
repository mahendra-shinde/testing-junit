package mary.demo.webtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private static final String LOGIN_ID = "login";

	private static final String USERNAME_ID = "username";

	private static final int TIMEOUT_SECONDS = 20;

	public String login(WebDriver driver, String un) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
		WebElement userNameElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(USERNAME_ID)));
		userNameElement.sendKeys(un);

		WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(LOGIN_ID)));
		loginButtonElement.click();

		String nextPageTitle = driver.getTitle();

		return nextPageTitle;

	}
}
