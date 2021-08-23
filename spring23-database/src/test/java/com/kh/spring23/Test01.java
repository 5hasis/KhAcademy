package com.kh.spring23;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import lombok.extern.slf4j.Slf4j;

//목표 : 데이터베이스 관련 도구를 스프링에서 가져다 쓸 수 있는지 확인
@Slf4j
@SpringBootTest
public class Test01 {

	@Autowired
	@Qualifier("dbcpSource")
//	@Qualifier("dataSource")
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test() {
		log.debug("dataSource = {}", dataSource);
		log.debug("jdbcTemplate = {}", jdbcTemplate);
	}
	
}