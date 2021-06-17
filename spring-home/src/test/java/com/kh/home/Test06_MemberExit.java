package com.kh.home;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//테스트 목적 : 회원 삭제가 정상적으로 이루어지는 지 확인

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test06_MemberExit {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Before //@Test 실행 전에 자동 실행되는 메소드 지정
	public void before() {
		System.out.println("사전 작업");
	}
	
	@Test
	public void test() {
		System.out.println("테스트 시작");
		int memberNo = 32;
		
		String sql = "delete from member where member_no = ?";
		Object[] param = {memberNo};
		jdbcTemplate.update(sql, param);
		System.out.println("테스트 종료");
	}
	
	@After //@Test 실행 후에 자동 실행되는 메소드 지정
	public void after() {
		System.out.println("마무리작업");
	}

}
