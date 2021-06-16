package com.kh.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test05_MemberChangeInfo {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {
		String sql = "update member "
				+ "set member_nick=?, member_birth=?, member_phone=?, member_email=? "
				+ "where member_no=? and member_pw=?";
		Object[] param = {"테스트계정", "2002-02-02", "010-0200-2020", "khacademy@kh.com", 40, "testuser1201"};
		jdbcTemplate.update(sql, param);
		
	}
}
