package com.winter.app.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.member.MemberDAO.";
	
	
	
	public int setJoin(MemberDTO memberDTO)throws Exception{
		return sqlSession.insert(namespace+"setJoin", memberDTO);
	}
	public int setAvatarJoin(AvatarDTO avatarDTO)throws Exception{
		return sqlSession.insert(namespace+"setAvatarJoin", avatarDTO);
	}
	
	public MemberDTO getDetail(MemberDTO memberDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail", memberDTO);
	}
	
	public int setUpdate(MemberDTO memberDTO)throws Exception{
		return sqlSession.update(namespace+"setUpdate", memberDTO);
	}
}
