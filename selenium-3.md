## Selenium WebDriver demo

1.  Download the [sample-app1](./sample-app1/) from repository .
2.  Run the project from eclipse

3.  Create a new maven project with following configuration:

    ```
    ProjectName:    selenium-demo2
    GroupId:        com.mahendra
    ArtifactId:     seleniumdemo2
    version:        1
    Packaging:      JAR
    ```

4.  Open `pom.xml` file and add new dependency:

    ```xml
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>2.41.0</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    ```

5.  Create a new Java Class in directory `src/test/java` with package `com.mahendra`

    ```java
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
    ```

6.  Run the project as JUnit Test