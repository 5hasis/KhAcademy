package com.kh.spring09;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.spring09.entity.ItemDto;

public class Test05 {
	private SqlSession sqlSession;
	
	@Before
	public void before() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		sqlSession = factory.openSession(false);
	}
	
	@Test
	public void test() {
//		데이터베이스 검색(search)
//		= map이나 객체처럼 이름이 명시된 형태라면 이름이 다르면 오류가 발생
//		= 단순하게 데이터를 1개만 변수로 전달하면 이름은 큰 의미가 없음.
		
//		String itemName = "피자10판";
//		List<ItemDto> list = sqlSession.selectList("item.select2", itemName);
		
		Map<String, Object> map = new HashMap<>();
		map.put("itemName", "피자10판");
		List<ItemDto> list = sqlSession.selectList("item.select2", map);
		
		for(ItemDto itemDto : list) {
			System.out.println(itemDto);
		}
	}
	
	@After
	public void after() {
//		sqlSession.commit();
		sqlSession.rollback();
	}
}


