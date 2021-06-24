package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

//목표 : 수동으로 트랜잭션 관리를 구현(spring-tx 불필요)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@WebAppConfiguration
public class Test02 {

	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * @Transactional 을 붙여 이 메소드의 작업은 하나의 단위작업임을 표시
	 * 	= 내부에 있는 데이터베이스 작업이 전부다 실행 또는 전부다 실행취소됨
	 *	= 일부만 실행되는 경우가 사라짐
	 *	= 서비스의 메소드에 표시하여 데이터베이스 작업을 통째로 진행
	 */
	
	@Test
	@Transactional
	public void test() {
		sqlSession.insert("student.insert1");
		sqlSession.insert("student.insert2");
	}
	
}

