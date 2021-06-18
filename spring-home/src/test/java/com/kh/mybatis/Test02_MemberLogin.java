package com.kh.mybatis;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kh.home.entity.MemberDto;

//스프링 환경을 연동하여 등록한 SqlSessionFactoryBean과 SqlSessionTemplate 사용
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test02_MemberLogin {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MemberDto memberDto = MemberDto.builder().memberId("test0001").memberPw("test0001").build();
		memberDto = sqlSession.selectOne("member.login",memberDto);
		
		assertNotNull(sqlSession);
	}
}
