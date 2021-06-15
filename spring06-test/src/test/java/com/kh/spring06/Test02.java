package com.kh.spring06;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {

	//목표 : JdbcTemplate을 직접 만들어서 명령을 실행시켜보기
	@Test
	public void test() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("study");
		dataSource.setPassword("study");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		String sql = "insert into item values(item_seq.nextval, ?, ?)";
		Object[] param = {"나이키신발", 35000};
		jdbcTemplate.update(sql,param);
	}
}
