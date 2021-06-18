package com.kh.spring09;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class Test02 {
	
	@Test
	public void test() throws IOException {
		InputStream in = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		
		//SQL 구문 실행 도구 생성
		//SqlSession sqlSession = factory.openSession(); //openSession(false)와 동일
		//SqlSession sqlSession = factory.openSession(true); //자동 커밋 사용
		SqlSession sqlSession = factory.openSession(false); //자동 커밋 미사용
		System.out.println(sqlSession);
		
		/*
		 * 이런식으로 사용
		 * sqlSession.insert("구문ID"); 
		 * sqlSession.selectList("구문ID");
		 * sqlSession.selectOne("구문ID"); 
		 * sqlSession.update("구문ID");
		 * sqlSession.delete("구문ID");
		 * 
		 * sqlSession.commit(); 
		 * sqlSession.rollback();
		 */
		
		sqlSession.insert("item.insert"); //매퍼파일의 namespace.id
		sqlSession.commit();
		
	}

}
