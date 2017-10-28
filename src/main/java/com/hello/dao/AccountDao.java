package com.hello.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.entity.Account;

/**
 * Account接口
 * @author admin
 *
 */
public interface AccountDao extends JpaRepository<Account, Integer>{

}
