package com.winter.app.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	private AccountDAO accountDAO;
	
	public int setAdd(AccountDTO accountDTO)throws Exception{
		return accountDAO.setAdd(accountDTO);
	}
	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return accountDAO.getList(accountDTO);
	}
}
