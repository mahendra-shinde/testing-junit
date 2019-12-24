package com.mahendra;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;
import org.testng.annotations.*;


public class BankTest {
	Bank bank = null;
	@BeforeTest
	public void setUp() throws Exception {
		///PREPEARED THE MOCK DATA
		Account ac1 = new Account("Shankar", "SB102", 2300D);
		Account ac2 = new Account("Ehsaan","SB103",13000D);
		Account ac3 = new Account("Loy","SB101",12000D);
		List<Account> accounts = Arrays.asList(ac1,ac2,ac3);
		bank = new Bank(accounts);
		System.out.println("Mock data is ready!");
	}

	@AfterTest
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
