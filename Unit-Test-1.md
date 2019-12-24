### Unit Test demo1

1.  Create a new Maven project
    ```            
    File > New > Maven project 
      [Checkbox] Create Simple project
      Fill in details:
      groupId: com.mahendra
      artifactId: test-demo1    
      version: 1
      Packaging: jar
      Name: testdemo1
    ```

2.  Open the `pom.xml` file and add these lines just before the END tag `</project>`

    ```xml
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>6.10</version>
        <scope>test</scope>
    </dependency>    
    ```

3.  Create a new Java class under `src/main/java` with package name `com.mahendra`

    ```java
    public class Calculator {
	public int doSum(int n,int m) {
		return n+m;
	}
	
	public int doSub(int n,int m) {
		return n+m;
	}
	
	public int doDiv(int n,int m) {
		return n+m;
	}
	
	public int doMult(int n,int m) {
		return n+m;
	}
    }
    ```

4.  Create another Java class in directory `src/test/java` with package name `com.mahendra`

    ```java
    public class TestCase1 {
        Calculator calc = new Calculator();
        @BeforeTest
        public void doSomethingBefore() {
            System.out.println("The beforeTest method.....");
        }
        
        @AfterTest
        public void doSomethingAfter() {
            System.out.println("The afterTest method....");
        }
        
        @Test
        public void testSum() {
            int ans = calc.doSum(10, 12);
            Assert.assertEquals(ans,22);
        }
        
        @Test
        public void testSub() {
            int ans = calc.doSub(10, 12);
            Assert.assertEquals(ans,-2);
        }
        
        @Test
        public void testDiv() {
            int ans = calc.doDiv(10, 2);
            Assert.assertEquals(ans,5);
        }
        @Test
        public void testMult() {
            int ans = calc.doMult(10, 2);
            Assert.assertEquals(ans,20);
        }
    }

    ```

5.  Make sure, your project uses JDK instead of JRE

    Window Menu -> Preferences -> Search for JRE -> Installed JRE

    Click on 'Add' button and provide JDK path `C:\program files\java\jdk1.XXXXX`

    Press `Apply & Close` button

    Right click on your project -> Properties (ALT+ENTER) 

    Goto Build Path -> Choose "JRE System Library" -> EDIT -> Select "Workspace Default"


6.  Right click on project and choose "Run As" -> "Maven Test"

7.  The Test report would be created by a maven plugin called `SureFire` 

    Look for 'target/surefire-reports/' directory and open `index.html` file.
