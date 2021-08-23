package com.kh.home.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.home.entity.MemberDto;

@Repository
public class MemberDaoMybatis implements MemberDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(MemberDto memberDto) {
//		Map<String, Object> param = new HashMap<>();
//		param.put("memberId", memberDto.getMemberId());
//		param.put("memberPw", memberDto.getMemberPw());
//		param.put("memberNick", memberDto.getMemberNick());
//		param.put("memberPhone", memberDto.getMemberPhone());
//		param.put("memberBirth", memberDto.getMemberBirth());
//		param.put("memberEmail", memberDto.getMemberEmail());
		sqlSession.insert("member.regist",memberDto);
	}

	@Override
	public MemberDto login(MemberDto memberDto) {
		return sqlSession.selectOne("member.login",memberDto);
	}

	@Override
	public MemberDto get(int memberNo) {
		return sqlSession.selectOne("member.get",memberNo);
	}

	@Override
	public boolean changePw(int memberNo, String curPw, String newPw) {
		Map<String,Object> param = new HashMap<>();
		param.put("memberNo", memberNo);
		param.put("curPw", curPw);
		param.put("newPw", newPw);
		int count = sqlSession.update("member.changePw",param);
		return count > 0;
	}

	@Override
	public boolean changeInfo(MemberDto memberDto) {
		int count = sqlSession.update("member.changeInfo", memberDto);
		return count > 0;
	}

	@Override
	public boolean delete(int memberNo) {
		int count = sqlSession.delete("member.exit", memberNo);
		return count > 0;
	}
	

}
