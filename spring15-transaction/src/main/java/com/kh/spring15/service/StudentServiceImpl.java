package com.kh.spring15.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	@Transactional
	public void insert() {
		sqlSession.insert("student.insert1");
		sqlSession.insert("student.insert2");
	}

}