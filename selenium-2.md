## Selenium WebDriver

1.  Download selenium web-driver for Google Chrome

    https://sites.google.com/a/chromium.org/chromedriver/

    Choose latest stable version (for matching OS)

2.  Open the downloaded ZIP file and extract "chromedriver.exe" into `D:\s` directory.

3.  Create a new maven project in eclipse

    ```yaml
    ProjectName:    selenium-demo1
    GroupId:        com.mahendra
    ArtifactId:     seleniumdemo1
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
    ```
6.  Right click anywhere in `TestCase1.java` and choose `Run As > JUnit Test`

7.  Observe a Chrome Windows Opened and closed.