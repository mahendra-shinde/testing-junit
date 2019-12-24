### Unit Test demo2

1.  Create a new Maven project
    ```            
    File > New > Maven project 
      [Checkbox] Create Simple project
      Fill in details:
      groupId: com.mahendra
      artifactId: test-demo2    
      version: 1
      Packaging: jar
      Name: testdemo2
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
    public class Account {
        private String accHolder;
        private String accNo;
        private Double balance;
        
        static final double MIN_BALANCE=1000;
        
        public String getAccHolder() {
            return accHolder;
        }
        public void setAccHolder(String accHolder) {
            this.accHolder = accHolder;
        }
        public String getAccNo() {
            return accNo;
        }
        public void setAccNo(String accNo) {
            this.accNo = accNo;
        }
        public Double getBalance() {
            return balance;
        }
        public void setBalance(Double balance) {
            this.balance = balance;
        }
        public Account(String accHolder, String accNo, Double balance) {
            super();
            this.accHolder = accHolder;
            this.accNo = accNo;
            this.balance = balance;
        }
           
    }
    ```
4.  Create a new Java class under `src/main/java` with package name `com.mahendra`

    ```java
    public class Bank {
        private List<Account> accounts;

        public Bank(List<Account> accounts) {
            super();
            this.accounts = accounts;
        }
        
        Account findAccount(String accNo) {
            for(Account a: accounts) {
                if(a.getAccNo().equalsIgnoreCase(accNo))
                {
                    return a;
                }
            }
            return null;
        }
        
        boolean withdraw(String accNo, double amt) {
            Account acc = findAccount(accNo);
            acc.setBalance(acc.getBalance()-amt);
            return true;
        }
        
        boolean deposit(String accNo, double amt) {
            Account acc = findAccount(accNo);
            acc.setBalance(acc.getBalance()+amt);
            return true;
        }
    }
    ```
5.  Create another Java class in directory `src/test/java` with package name `com.mahendra`

    ```java    
    import java.util.Arrays;
    import java.util.List;

    import static org.testng.Assert.*;
    import org.testng.annotations.*;

    public class BankTest {
    Bank bank = null;
        @BeforeMethod
        public void setUp() throws Exception {
            ///PREPEARED THE MOCK DATA
            Account ac1 = new Account("Shankar", "SB102", 2300D);
            Account ac2 = new Account("Ehsaan","SB103",13000D);
            Account ac3 = new Account("Loy","SB101",12000D);
            List<Account> accounts = Arrays.asList(ac1,ac2,ac3);
            bank = new Bank(accounts);
            System.out.println("Mock data is ready!");
        }

        @AfterMethod
        public void tearDown() throws Exception {
            bank = null;	//Delete all records
        }

        @Test
        public void testWithdraw() {
            boolean success = bank.withdraw("SB102", 1000D);
            assertEquals(bank.findAccount("SB102").getBalance(),1300D,0.01);
        }

        @Test
        public void testDeposit() {
            boolean success = bank.deposit("SB102", 1000D);
            assertEquals(bank.findAccount("SB102").getBalance(),3300D,0.01);
            
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
