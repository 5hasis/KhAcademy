package com.kh.spring17.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring17.entity.CertDto;

@Repository
public class CertDaoImpl implements CertDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(CertDto certDto) {
		sqlSession.insert("cert.insert2", certDto);
	}

	@Override
	public boolean check(CertDto certDto) {
		CertDto find = sqlSession.selectOne("cert.check", certDto);
//		if(find == null) return false;
//		else return true;
		return find != null;
	}

	@Override
	public void deleteByEmail(String email) {
		sqlSession.delete("cert.deleteByEmail", email);
	}
}
