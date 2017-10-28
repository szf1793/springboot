package com.hello.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hello.dao.AccountDao;
import com.hello.entity.Account;
import com.hello.service.AccountService;



@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	
	@Resource
	private AccountDao accountDao;
	

	@Override
	public void transferAccounts(Integer forId, Integer toId, double money) {
		
		//转账
		Account forMoney = accountDao.getOne(forId);
		forMoney.setMoney(forMoney.getMoney()-money);
		accountDao.save(forMoney);
		
		//加钱
		Account toMoney = accountDao.getOne(toId);
		toMoney.setMoney(toMoney.getMoney()+money);
		accountDao.save(toMoney);
	}
	
	

}
