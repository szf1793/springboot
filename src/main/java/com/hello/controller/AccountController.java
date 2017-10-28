package com.hello.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	
	@Resource
	private AccountService accountService;
	
	
	@RequestMapping("/transfer")
	private String transferAccounts() {
		try{
            accountService.transferAccounts(2, 1, 200);
            return "ok";
        }catch(Exception e){
            return "no";
        }
	}
	
	

}
