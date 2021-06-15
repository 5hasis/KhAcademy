package com.kh.spring06;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test03 {
	
	//목표 : BasicDateSource와 JdbcTemplate을 이용한 insert
	
	@Test
	public void test() {
		BasicDataSource dbcpSource = new BasicDataSource();
		dbcpSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dbcpSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dbcpSource.setUsername("study");
		dbcpSource.setPassword("study");
		dbcpSource.setMaxTotal(20);
		dbcpSource.setMaxIdle(10);
		dbcpSource.setMaxWaitMillis(3000L);
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dbcpSource);
		
		String sql = "insert into item values(item_seq.nextval, ?, ?)";
		Object[] param = {"아이폰12", 1000000};
		jdbcTemplate.update(sql, param);
	}
}
