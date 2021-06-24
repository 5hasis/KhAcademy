package com.kh.home.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.home.entity.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int sequence() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDto> list() {
		List<BoardDto> boardList = sqlSession.selectList("board.list");
		return boardList;
	}

}
