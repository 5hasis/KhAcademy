package com.kh.mybatis;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.home.entity.MemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test01_MemberRegist {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MemberDto memberDto = MemberDto.builder()
											.memberId("test0009")
											.memberPw("test0009")
											.memberNick("테슾튼훈일")
											.memberBirth("2001-01-18")
											.memberPhone("010-0010-0110")
											.memberEmail("oha@kh.kh")
									   .build();
		sqlSession.insert("member.regist",memberDto);
		
		assertNotNull(sqlSession);
	}
	

}
