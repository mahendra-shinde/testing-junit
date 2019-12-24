package com.mahendra.testdemo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mahendra.testdemo.entity.Account;

@Repository
public class AccountRepositoryImpl implements AccountRepository
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Account save(Account account) {
		em.persist(account);
		return account;
	}

	@Override
	public Account findByUserName(String userName) {
		TypedQuery<Account> q= em.createNamedQuery("find",Account.class);
		q.setParameter("username",userName.toLowerCase());
		return q.getSingleResult();
	}
	
}
