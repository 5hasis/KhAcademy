package com.kh.home.repository;

import java.util.List;

import com.kh.home.entity.BoardDto;

public interface BoardDao {
	int sequence();
	List<BoardDto> list();
}
