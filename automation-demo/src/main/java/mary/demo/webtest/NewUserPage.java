package mary.demo.webtest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewUserPage {

	private static final String FIRSTNAME_XPATH = "//input[@id='firstname']";

	private static final String SAVE_ID = "save";

	private static final String LASTTNAME_ID = "lasttname";

	private static final int TIMEOUT_SECONDS = 20;


	public String save(WebDriver driver, String firstName, String lastName) throws IOException {

		WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
		WebElement firstNameElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(FIRSTNAME_XPATH)));
		firstNameElement.sendKeys(firstName);

		WebElement lastNameElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(LASTTNAME_ID)));
		lastNameElement.sendKeys(lastName);

		WebElement saveButtonElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(SAVE_ID)));
		saveButtonElement.click();

		String nextPageTitle = driver.getTitle();
	
		return nextPageTitle;

	}
}
