package com.winter.app.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.member.MemberDTO;
import com.winter.app.util.Pager;

@Service
public class AccountService {
	@Autowired
	private AccountDAO accountDAO;
	
	public int setAdd(AccountDTO accountDTO)throws Exception{
		return accountDAO.setAdd(accountDTO);
	}
	public List<AccountDTO> getList(Pager pager,MemberDTO memberDTO)throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		pager.makeRow();
		map.put("Pager", pager);
		map.put("memberDTO", memberDTO);
		
		return accountDAO.getList(map);
	}
}
