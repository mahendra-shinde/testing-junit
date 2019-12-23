package com.mahendra;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankTest {
Bank bank = null;
	@Before
	public void setUp() throws Exception {
		///PREPEARED THE MOCK DATA
		Account ac1 = new Account("Shankar", "SB102", 2300D);
		Account ac2 = new Account("Ehsaan","SB103",13000D);
		Account ac3 = new Account("Loy","SB101",12000D);
		List<Account> accounts = Arrays.asList(ac1,ac2,ac3);
		bank = new Bank(accounts);
		System.out.println("Mock data is ready!");
	}

	@After
	public void tearDown() throws Exception {
		bank = null;	//Delete all records
	}

	@Test
	public void testWithdraw() {
		boolean success = bank.withdraw("SB102", 1000D);
		assertEquals (1300D ,bank.findAccount("SB102").getBalance(),0.1);
	}

	@Test
	public void testDeposit() {
		boolean success = bank.deposit("SB102", 1000D);
		assertEquals(3300D,bank.findAccount("SB102").getBalance(),0.1);
		
	}

}
