package com.mahendra.testdemo.service;

import com.mahendra.testdemo.entity.Account;

public interface AccountService {
	Account findByUsername(String username);
	Account save(Account accout);
}
