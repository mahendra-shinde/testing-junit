package mary.demo.webtest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

public class ErrorPageTest extends WebTestBase {

	private ErrorPage errorPage = new ErrorPage();;

	@Test
	public void login_invalid_user() throws IOException {
		String nextPage = errorPage.badUrl(driver, "http://localhost:8080/notexistUrl");
		screenshotHelper.saveScreenshot("error_screenshot.png");
		assertEquals("error", nextPage);
	}

}
