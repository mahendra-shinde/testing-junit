package mary.demo.webtest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class NewUserPageTest extends WebTestBase {

	private HomePage homepage = new HomePage();
	private NewUserPage newUserPage = new NewUserPage();

	@Test
	public void create_new_user() throws IOException {
		driver.get("http://localhost:8080/");
		String nextPage = homepage.login(driver, "MaryZheng");
		if ("New User".equalsIgnoreCase(nextPage)) {
			nextPage = newUserPage.save(driver, "Alex", "Zheng");
			screenshotHelper.saveScreenshot("newuser_screenshot.png");
			assertEquals("User Account Detail", nextPage);
		}
		else {
			assertEquals("User Account Detail", nextPage);
		}
	}

}
