package com.winter.app.account;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.account.AccountDAO.";
	
	public int setAdd(AccountDTO accountDTO)throws Exception{
		return sqlSession.insert(namespace+"setAdd", accountDTO);
	}
	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return sqlSession.selectList(namespace+"getList", accountDTO);
	}
		
}
