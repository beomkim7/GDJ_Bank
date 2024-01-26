package com.winter.app.product;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.product.ReplyDAO.";
	
	public int setReplt(ReplyDTO replyDTO) throws Exception{
		return sqlSession.insert(namespace+"setReply", replyDTO);
	}

}
