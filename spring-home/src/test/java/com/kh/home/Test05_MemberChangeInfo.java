package com.kh.home;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
public class Test05_MemberChangeInfo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private MemberDto memberDto;
	
	@Before
	public void before() {
		memberDto = new MemberDto();
		memberDto.setMemberNo(1);
		memberDto.setMemberPw("test0001");
		memberDto.setMemberNick("변경테스트");
		memberDto.setMemberBirth("2000-12-10");
		memberDto.setMemberPhone("010-5678-9101");
		memberDto.setMemberEmail("change@kh.com");
	}
	
	@Test
	public void test() {
		String sql = "update member "
				+ "set member_nick=?, member_birth=?, member_phone=?, member_email=? "
				+ "where member_no=? and member_pw=?";
		Object[] param = {
				memberDto.getMemberNick(),
				memberDto.getMemberBirth(),
				memberDto.getMemberPhone(),
				memberDto.getMemberEmail(),
				memberDto.getMemberNo(),
				memberDto.getMemberPw()
		};
		int count = jdbcTemplate.update(sql, param);
		
		assertEquals(1, count);
	}
	
	@After
	public void after() {
		//롤백 등의 작업
	}
}
