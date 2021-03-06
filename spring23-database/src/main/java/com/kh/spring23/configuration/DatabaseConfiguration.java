package com.kh.spring23.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *		Configuration 계층
 *		= 스프링 시작 시에 초기 설정을 수행하는 역할의 도구
 * 		= 그 어떤 도구들보다도 먼저 실행되므로 Service나 Respository 사용 불가
 * 		= @Configuration 으로 등록
 * 			= @Bean 으로 spring bean 등록
 */
@Configuration
public class DatabaseConfiguration {
	
//	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
//		<property name="driverClassName" value="oracle.jdbc.OracleDriver"></property>
//		<property name="url" value="jdbc:oracle:thin:@localhost:1521:xe"></property>
//		<property name="username" value="study"></property>
//		<property name="password" value="study"></property>
//	</bean>
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("study");
		dataSource.setPassword("study");
		return dataSource;
	}
	
//	<bean id="dbcpSource" class="org.apache.commons.dbcp2.BasicDataSource">
//		<property name="driverClassName" value="oracle.jdbc.OracleDriver"></property>
//		<property name="url" value="jdbc:oracle:thin:@localhost:1521:xe"></property>
//		<property name="username" value="study"></property>
//		<property name="password" value="study"></property>
//		
//		<property name="maxTotal" value="20"></property>
//		<property name="maxIdle" value="10"></property>
//		<property name="maxWaitMillis" value="3000"></property>
//	</bean>	
	@Bean
	public DataSource dbcpSource() {
		BasicDataSource dbcpSource = new BasicDataSource();
		dbcpSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dbcpSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dbcpSource.setUsername("study");
		dbcpSource.setPassword("study");
		dbcpSource.setMaxTotal(20);
		dbcpSource.setMaxIdle(10);
		dbcpSource.setMaxWaitMillis(3000);
		return dbcpSource;
	}
	
	
//	<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
//		<property name="dataSource" ref="dbcpSource"></property>
//	</bean>	
	@Bean
//	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	public JdbcTemplate jdbcTemplate(DataSource dbcpSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dbcpSource);
		return jdbcTemplate;
	}
}


