package com.kh.spring09;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring09.entity.ItemDto;

//체계적으로 준비 및 테스트, 마무리를 수행하도록 구조 변경
public class Test04 {
	
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(false);
	}
	
	@Test
	public void test() {
		List<ItemDto> list = sqlSession.selectList("select1");
		for(ItemDto itemDto : list) {
			System.out.println(itemDto);
		}
	}
	
	@After
	public void after() {
		//sqlSession.commit();
		sqlSession.rollback();
	}

}
