package com.kh.spring09;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring09.entity.ItemDto;

//체계적으로 준비 및 테스트, 마무리를 수행하도록 구조 변경
public class Test03 {
	
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(false);
	}
	
	@Test
	public void test() {
		//mybatis 구문 호출 시에는 데이터를 1덩어리만 전달 가능
		//= 전달되는 데이터는 반드시 이름이 있어야함.
		//= 객체 또는 Map 형태로 추가
		
		//객체 형태
		ItemDto itemDto = ItemDto.builder().itemName("뽀로로인형").itemPrice(6500).build();
		sqlSession.insert("item.insert3",itemDto);

	}
	
	@Test
	public void test2() {
		//Map 형태 <key, value>
		Map<String, Object> param = new HashMap<>();
		param.put("itemName", "피카츄인형");
		param.put("itemPrice", 5900);
		sqlSession.insert("item.insert4",param);
	}
	
	@After
	public void after() {
		//sqlSession.commit();
		sqlSession.rollback();
	}

}
