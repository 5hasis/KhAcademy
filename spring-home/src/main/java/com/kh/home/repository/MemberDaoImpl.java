package com.kh.home.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.home.entity.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(MemberDto memberDto) {
		String sql = "insert into member values("
				+ "member_seq.nextval, ?, ?, ?, ?, ?, sysdate, ?, 0, '일반')";
		Object[] param = {
				/* 아이디 */	memberDto.getMemberId(),
				/* 비밀번호 */	memberDto.getMemberPw(),
				/* 닉네임 */	memberDto.getMemberNick(),
				/* 생년월일 */	memberDto.getMemberBirth(),
				/* 전화번호 */	memberDto.getMemberPhone(),
				/* 이메일 */	memberDto.getMemberEmail()
		};
		jdbcTemplate.update(sql,param);
		
	}

}
