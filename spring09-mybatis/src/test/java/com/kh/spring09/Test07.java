package com.kh.spring09;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring09.entity.ItemDto;

public class Test07 {
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(false);
	}
	
	@Test
	public void test() {
		//Primary key를 이용한 단일 조회
		int itemNo = 10;
		ItemDto itemDto = sqlSession.selectOne("item.select4", itemNo);
		System.out.println(itemDto);
		
		assertNotNull(itemDto);
	}
	
	@After
	public void after() {
//		sqlSession.commit();
		sqlSession.rollback();
	}
}
