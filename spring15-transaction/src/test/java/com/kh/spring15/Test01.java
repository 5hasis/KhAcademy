package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.slf4j.Slf4j;

//목표 : 수동으로 트랜잭션을 구현(spring-tx)불필요
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
@Slf4j
public class Test01 {

	@Autowired
	private SqlSessionFactory factory;
	
	@Test
	public void test() {
		SqlSession sqlSession = factory.openSession(false);
		
		try {
			sqlSession.insert("student.insert1");
			sqlSession.insert("student.insert2");
			sqlSession.commit();
			//System.out.println("commit");
			log.debug("commit");
		}
		catch(Exception e) {
			sqlSession.rollback();
			//System.out.println("rollback");
			log.debug("rollback");
		}
		
	}
}
