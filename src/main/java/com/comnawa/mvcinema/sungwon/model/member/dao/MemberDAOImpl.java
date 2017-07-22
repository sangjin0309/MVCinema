package com.comnawa.mvcinema.sungwon.model.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.comnawa.mvcinema.sungwon.model.member.dto.MemberDTO;


@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;
	

	@Override
	public String checkid(String userid) {
		return sqlSession.selectOne("member.check_id",userid);
	}



}