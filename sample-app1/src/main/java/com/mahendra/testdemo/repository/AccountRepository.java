package com.mahendra.testdemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mahendra.testdemo.entity.Account;


public interface AccountRepository {

	Account save(Account accout);
	
	Account findByUserName(String userName);

	
}
